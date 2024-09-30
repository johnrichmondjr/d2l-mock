package edu.depaul.cdm.se452.d2l_mock.course.Events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Unique identifier for the event
    private Long courseId;  // ID of the course to which the event belongs
    private String title;  // The event's title
    private String description;  // The event's description
    private LocalDate eventDate;  // The event's date
}