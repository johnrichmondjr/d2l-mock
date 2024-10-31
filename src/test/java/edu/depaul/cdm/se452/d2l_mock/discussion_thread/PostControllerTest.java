package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class PostControllerTest {
    private static final String POST_URL = "/posts";

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testSavePost() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.post(POST_URL + "/new")
                        .param("discussionThreadID", "1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("discussion_thread/show"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("thread"));
    }
}
