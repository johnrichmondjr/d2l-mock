package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DiscussionThread represents a Discussion Thread in a course.
 * Discussion Threads are used to facilitate online discussions between students
 * and instructors.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DiscussionThread {
    private String title;
    private Poster author;
    private LocalDateTime createdAt;
    private String subject;
    private Post[] posts;
}
