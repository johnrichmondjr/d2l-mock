package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DiscussionThreadTest {
    @DisplayName("Test DiscussionThread instantiation")
    @Test
    public void testDiscussionThreadInstantiation() {
        DiscussionThread discussionThread = new DiscussionThread();
        discussionThread.setId(1);
        discussionThread.setTitle("Test Title");
        discussionThread.setSubject("A Subject about SE452");

        String expectedString = "DiscussionThread(id=1, title=Test Title, subject=A Subject about SE452)";

        assertEquals(expectedString, discussionThread.toString());
    }
}
