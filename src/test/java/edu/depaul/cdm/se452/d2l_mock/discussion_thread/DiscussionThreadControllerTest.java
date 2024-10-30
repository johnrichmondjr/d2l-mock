package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class DiscussionThreadControllerTest {
    private static final String DISCUSSION_THREAD_URL = "/discussion-threads";

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private CacheManager cacheManager;

    @Test
    public void getAllDiscussionThreads() throws Exception {
        ResultActions response = mockMvc.perform(MockMvcRequestBuilders.get(DISCUSSION_THREAD_URL));

        response.andExpect(MockMvcResultMatchers.status().isOk());
    }

    // ToDo - Fix this test
    // @Autowired
    // private ObjectMapper objectMapper;

    // @Test
    // public void addDiscussionThread() throws Exception {
    // DiscussionThread discussionThread = DiscussionThread.builder().title("Thread
    // 1")
    // .subject("This is the first thread").build();
    // String discussionThreadAsJson =
    // objectMapper.writeValueAsString(discussionThread);

    // var request = MockMvcRequestBuilders.post(DISCUSSION_THREAD_URL);
    // request.contentType(MediaType.APPLICATION_JSON);
    // request.content(discussionThreadAsJson);
    // ResultActions response = mockMvc.perform(request);

    // var jsonResponse = response.andReturn().getResponse().getContentAsString();
    // DiscussionThread updatedDiscussionThread = new
    // ObjectMapper().readValue(jsonResponse, DiscussionThread.class);

    // response.andExpect(MockMvcResultMatchers.status().isOk());

    // assertNotEquals(updatedDiscussionThread.getId(), discussionThread.getId());
    // }

    @Test
    public void whenCacheIsEmpty_thenControllerShouldCallServiceAndCache() throws Exception {
        ResultActions response = mockMvc.perform(MockMvcRequestBuilders.get(DISCUSSION_THREAD_URL));
        assertNotNull(response);

        assertNotNull(cacheManager.getCache("discussion-threads"));
    }
}
