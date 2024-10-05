package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * DiscussionThread represents a Discussion Thread in a course.
 * Discussion Threads are used to facilitate online discussions between students
 * and instructors.
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DiscussionThread {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String subject;

    @ToString.Exclude
    @OneToMany(fetch = FetchType.EAGER)
    private List<Post> posts;
}
