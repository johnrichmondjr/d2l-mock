package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@ActiveProfiles("dev")
public class PostRepositoryTest {
    @Autowired
    private PostRepository postRepo;

    @Test
    public void testPostRepository() {
        Post post = new Post();
        post.setContent("I have no idea what's going on in MS1. Please Help!");
        postRepo.save(post);

        var postCount = postRepo.count();
        assertEquals(1, postCount);

        String postContent = postRepo.findById(post.getId()).get().getContent();
        String expectedContent = "I have no idea what's going on in MS1. Please Help!";
        assertEquals(expectedContent, postContent);
    }
}
