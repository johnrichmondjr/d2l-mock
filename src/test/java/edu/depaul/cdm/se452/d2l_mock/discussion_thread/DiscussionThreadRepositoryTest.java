package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@ActiveProfiles("dev")
public class DiscussionThreadRepositoryTest {
    @Autowired
    private DiscussionThreadRepository discussionThreadRepo;

    @Autowired
    private PostRepository postRepo;

    @Test
    public void testDiscussionThreadRepository() {
        ArrayList<Post> ms1ThreadPosts = new ArrayList<Post>();
        ArrayList<Post> ms2ThreadPosts = new ArrayList<Post>();

        Post ms1Post1 = new Post();
        ms1Post1.setContent("I have no idea what's going on in MS1. Please Help!");
        ms1ThreadPosts.add(ms1Post1);
        postRepo.save(ms1Post1);

        Post ms1Post2 = new Post();
        ms1Post2.setContent("I agree, MS1 is a mess.");
        ms1ThreadPosts.add(ms1Post2);
        postRepo.save(ms1Post2);

        Post ms2Post1 = new Post();
        ms2Post1.setContent("MS2 is so much better than MS1.");
        ms2ThreadPosts.add(ms2Post1);
        postRepo.save(ms2Post1);

        Post ms2Post2 = new Post();
        ms2Post2.setContent("I'm so glad we're done with MS1.");
        ms2ThreadPosts.add(ms2Post2);
        postRepo.save(ms2Post2);

        Post ms2Post3 = new Post();
        ms2Post3.setContent("You can say that again!");
        ms2ThreadPosts.add(ms2Post3);
        postRepo.save(ms2Post3);

        DiscussionThread ms1Thread = new DiscussionThread();
        ms1Thread.setTitle("MS1 Discussion Thread");
        ms1Thread.setSubject("What the heck is going on in MS1?");
        ms1Thread.setPosts(ms1ThreadPosts);
        discussionThreadRepo.save(ms1Thread);

        DiscussionThread ms2Thread = new DiscussionThread();
        ms2Thread.setTitle("MS2 Discussion Thread");
        ms2Thread.setSubject("MS2 makes a lot more sense than MS1");
        ms2Thread.setPosts(ms2ThreadPosts);
        discussionThreadRepo.save(ms2Thread);

        DiscussionThread thread1 = discussionThreadRepo.findById(ms1Thread.getId()).get();
        assertEquals(thread1.getTitle(), "MS1 Discussion Thread");
        assertEquals(thread1.getSubject(), "What the heck is going on in MS1?");
        assertEquals(thread1.getPosts().size(), 2);

        DiscussionThread thread2 = discussionThreadRepo.findById(ms2Thread.getId()).get();
        assertEquals(thread2.getTitle(), "MS2 Discussion Thread");
        assertEquals(thread2.getSubject(), "MS2 makes a lot more sense than MS1");
        assertEquals(thread2.getPosts().size(), 3);
    }

}
