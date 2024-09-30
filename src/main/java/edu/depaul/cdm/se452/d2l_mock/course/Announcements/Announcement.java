package edu.depaul.cdm.se452.d2l_mock.course.Announcements;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Unique identifier for the announcement
    private Long courseId; // ID of the course to which the announcement belongs
    private String title; // Title of the announcement
    private String content; // Content of the announcement
    private LocalDateTime timestamp; // Timestamp when the announcement was posted
}