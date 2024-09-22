package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Post represents a post in a discussion thread.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post {
    private Poster author;
    private LocalDateTime createdAt;
    private String content;
}
