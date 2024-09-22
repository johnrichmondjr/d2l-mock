package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import edu.depaul.cdm.se452.d2l_mock.Student;

public class PostTest {
    @DisplayName("Testing Post class instantiation")
    @Test
    public void testPostInstantiation() {
        // Create author
        Student author = new Student();
        author.setFirstName("John");
        author.setLastName("Virginia");

        // Create Post
        LocalDateTime createdAt = LocalDateTime.now();
        Post post = new Post();
        post.setAuthor(author);
        post.setCreatedAt(createdAt);
        post.setContent("This is a reply to a discussion thread");

        assertNotNull(post);

        String expectedString = "Post(author=Student(birthdate=null, StudentID=0, firstName=John, lastName=Virginia, isAdmin=false), createdAt="
                + createdAt + ", content=This is a reply to a discussion thread)";

        assertEquals(expectedString, post.toString());
    }
}
