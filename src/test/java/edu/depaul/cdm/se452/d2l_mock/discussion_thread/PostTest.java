package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PostTest {
    @DisplayName("Testing Post class instantiation")
    @Test
    public void testPostInstantiation() {
        Post post = new Post();
        post.setContent("This is a reply to a discussion thread");

        assertNotNull(post);

        String expectedString = "Post(id=0, content=This is a reply to a discussion thread, discussionThread=null)";

        assertEquals(expectedString, post.toString());
    }
}
