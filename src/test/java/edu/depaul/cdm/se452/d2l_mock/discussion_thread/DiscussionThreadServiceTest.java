package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DiscussionThreadServiceTest {
    @Autowired
    private DiscussionThreadService service;

    @Test
    public void testAddCourse() {
        DiscussionThread thread = DiscussionThread.builder().title("Thread 1")
                .subject("This is the first thread").build();

        long b4 = service.list().size();
        service.save(thread);
        long after = service.list().size();

        assertEquals(b4 + 1, after);
    }
}
