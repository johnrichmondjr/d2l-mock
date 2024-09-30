package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DiscussionThreadTest {
    @DisplayName("Test DiscussionThread instantiation")
    @Test
    public void testDiscussionThreadInstantiation() {
        // Create DiscussionThread
        DiscussionThread discussionThread = new DiscussionThread();
        discussionThread.setTitle("Test Title");
        discussionThread.setSubject("A Subject about SE452");

        String expectedString = "DiscussionThread(id=0, title=Test Title, subject=A Subject about SE452, posts=null)";

        assertEquals(expectedString, discussionThread.toString());
    }
}
