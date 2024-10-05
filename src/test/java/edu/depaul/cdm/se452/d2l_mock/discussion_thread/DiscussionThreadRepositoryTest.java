package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DiscussionThreadRepositoryTest {
    @Autowired
    private DiscussionThreadRepository discussionThreadRepo;

    @Test
    public void testDiscussionThreadRepository() {
        DiscussionThread thread1 = discussionThreadRepo.findById(1L).get();
        assertEquals("First Thread", thread1.getTitle());
        assertEquals("This is the first thread", thread1.getSubject());
        assertEquals(thread1.getPosts().size(), 2);

        DiscussionThread thread2 = discussionThreadRepo.findById(2L).get();
        assertEquals("Second Thread", thread2.getTitle());
        assertEquals("This is the second thread", thread2.getSubject());
        assertEquals(thread2.getPosts().size(), 3);

        Post newPost = Post.builder().content("This is a new post").build();

        thread1.getPosts().add(newPost);
        discussionThreadRepo.save(thread1);

        assertEquals(3, thread1.getPosts().size());
    }
}
