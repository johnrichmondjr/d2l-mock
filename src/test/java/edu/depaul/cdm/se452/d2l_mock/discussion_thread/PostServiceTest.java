package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PostServiceTest {
    @Autowired
    private PostService service;

    @Test
    public void testAddCourse() {
        Post post = Post.builder().content("Post 1 Content").build();

        long b4 = service.list().size();
        service.save(post);
        long after = service.list().size();

        assertEquals(b4 + 1, after);
    }
}
