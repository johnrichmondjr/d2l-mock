package edu.depaul.cdm.se452.d2l_mock.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    // This interface extends JpaRepository to provide CRUD operations for the Course entity
}