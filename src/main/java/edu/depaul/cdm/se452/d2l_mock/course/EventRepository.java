package edu.depaul.cdm.se452.d2l_mock.course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}