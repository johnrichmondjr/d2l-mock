package edu.depaul.cdm.se452.d2l_mock.course.Events;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Repository interface for Event entity
public interface EventRepository extends JpaRepository<Event, Long> {
    // Custom query method to find events by course ID, ordered by event date in ascending order
    List<Event> findByCourseIdOrderByEventDateAsc(Long courseId);
}