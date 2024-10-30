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
public class DiscussionThreadControllerTest {
    private static final String DISCUSSION_THREAD_URL = "/discussion-threads";

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getAllDiscussionThreads() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get(DISCUSSION_THREAD_URL))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("discussion_thread/list"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("threads"));
    }

    @Test
    public void getDiscussionThreadById() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get(DISCUSSION_THREAD_URL + "/1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("discussion_thread/show"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("thread"));
    }

    @Test
    public void createDiscussionThread() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get(DISCUSSION_THREAD_URL + "/new"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("discussion_thread/new"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("thread"));
    }

    @Test
    public void createDiscussionThreadPost() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.post(DISCUSSION_THREAD_URL + "/new"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("discussion_thread/show"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("thread"));
    }
}
