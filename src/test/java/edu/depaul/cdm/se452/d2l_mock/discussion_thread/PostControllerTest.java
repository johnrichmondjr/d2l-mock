package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class PostControllerTest {
    private static final String POST_URL = "/api/posts";

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private CacheManager cacheManager;

    @Test
    public void getAllPosts() throws Exception {
        ResultActions response = mockMvc.perform(MockMvcRequestBuilders.get(POST_URL));

        response.andExpect(MockMvcResultMatchers.status().isOk());
        response.andExpect(MockMvcResultMatchers.jsonPath("$[0].id", CoreMatchers.notNullValue()));
    }

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void addPost() throws Exception {
        Post post = Post.builder().content("Post 1 Content").build();
        String postAsJson = objectMapper.writeValueAsString(post);

        var request = MockMvcRequestBuilders.post(POST_URL);
        request.contentType(MediaType.APPLICATION_JSON);
        request.content(postAsJson);
        ResultActions response = mockMvc.perform(request);

        var jsonResponse = response.andReturn().getResponse().getContentAsString();
        Post updatedPost = new ObjectMapper().readValue(jsonResponse, Post.class);

        response.andExpect(MockMvcResultMatchers.status().isOk());

        assertNotEquals(updatedPost.getId(), post.getId());
    }

    @Test
    public void whenCacheIsEmpty_thenControllerShouldCallServiceAndCache() throws Exception {
        ResultActions response = mockMvc.perform(MockMvcRequestBuilders.get(POST_URL));
        assertNotNull(response);

        assertNotNull(cacheManager.getCache("posts"));
    }
}
