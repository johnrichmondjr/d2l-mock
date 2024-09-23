package edu.depaul.cdm.se452.d2l_mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContentTest {
    @DisplayName("Test Lombok for Content")
    @Test
    public void testContentLombok() {
        Content content = new Content();
        content.setContentID(101);
        content.setTitle("Lecture 1: Introduction");
        content.setDescription("An introductory lecture about the basics.");
        content.setCourseID(501);

        String expectedContentString = "Content(contentID=101, title=Lecture 1: Introduction, description=An introductory lecture about the basics., courseID=501)";
        assertEquals(expectedContentString, content.toString());
    }
}
