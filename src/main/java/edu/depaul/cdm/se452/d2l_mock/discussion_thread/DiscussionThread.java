package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import java.util.List;
import java.io.Serializable;

import edu.depaul.cdm.se452.d2l_mock.student.Student;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
@Table(name = "discussion_threads")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DiscussionThread implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String subject;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id")
    private Student student;

    @ToString.Exclude
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "discussion_thread_id")
    private List<Post> posts;
}
