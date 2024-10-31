package edu.depaul.cdm.se452.d2l_mock.submission;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import edu.depaul.cdm.se452.d2l_mock.submission.dto.AssignmentDTO;
import java.util.List;


public interface AssignmentRepository extends JpaRepository<Assignment, Long>{

    @Query("SELECT new edu.depaul.cdm.se452.d2l_mock.submission.dto.AssignmentDTO(a.id, a.score, a.name, a.dueDate, a.course.id, a.student.id) FROM Assignment a WHERE a.course.id = :courseId")
    List<AssignmentDTO> findAssignmentsByCourse(@Param("courseId") Long courseId);

    @Query("SELECT CONCAT(a.student.firstName, ' ', a.student.lastName) FROM Assignment a WHERE a.student.id = :studentId")
    String findStudentFullName(@Param("studentId") Long studentId); // Unused for now
}
