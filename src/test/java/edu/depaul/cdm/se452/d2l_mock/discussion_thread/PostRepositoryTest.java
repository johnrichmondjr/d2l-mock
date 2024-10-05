package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PostRepositoryTest {
    @Autowired
    private PostRepository postRepo;

    @Test
    public void testPostRepository() {
        Post post = new Post();
        post.setContent("This is my 6th post! Check data.sql for the other 5 posts.");
        postRepo.save(post);

        var postCount = postRepo.count();
        assertEquals(6, postCount);

        String postContent = postRepo.findById(post.getId()).get().getContent();
        String expectedContent = "This is my 6th post! Check data.sql for the other 5 posts.";
        assertEquals(expectedContent, postContent);
    }
}
