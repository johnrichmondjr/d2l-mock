package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
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

    @Test
    public void getAllDiscussionThreads() throws Exception {
        ResultActions response = mockMvc.perform(MockMvcRequestBuilders.get(DISCUSSION_THREAD_URL));

        response.andExpect(MockMvcResultMatchers.status().isOk());
    }
}
