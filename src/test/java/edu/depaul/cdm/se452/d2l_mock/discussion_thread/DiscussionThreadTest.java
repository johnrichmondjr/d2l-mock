package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import edu.depaul.cdm.se452.d2l_mock.Student;

public class DiscussionThreadTest {
    @DisplayName("Test DiscussionThread instantiation")
    @Test
    public void testDiscussionThreadInstantiation() {
        // Create author
        Student author = new Student();
        author.setFirstName("Doc");
        author.setLastName("Holliday");

        // Create DiscussionThread
        DiscussionThread discussionThread = new DiscussionThread();
        LocalDateTime createdAt = LocalDateTime.now();
        discussionThread.setTitle("Test Title");
        discussionThread.setAuthor(author);
        discussionThread.setCreatedAt(createdAt);
        discussionThread.setSubject("A Subject about SE452");

        // Create Post
        Post post = new Post();
        post.setAuthor(author);
        post.setCreatedAt(LocalDateTime.now());
        post.setContent("This is the Reply to the Discussion Thread");

        Post[] posts = { post };

        discussionThread.setPosts(posts);

        String expectedString = "DiscussionThread(title=Test Title, author=Student(birthdate=null, StudentID=0, firstName=Doc, lastName=Holliday, isAdmin=false), createdAt="
                + createdAt
                + ", subject=A Subject about SE452, posts=[Post(author=Student(birthdate=null, StudentID=0, firstName=Doc, lastName=Holliday, isAdmin=false), createdAt="
                + post.getCreatedAt() + ", content=This is the Reply to the Discussion Thread)])";

        assertEquals(expectedString, discussionThread.toString());
    }
}
