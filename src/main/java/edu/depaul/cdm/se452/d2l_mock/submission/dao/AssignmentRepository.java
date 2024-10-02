package edu.depaul.cdm.se452.d2l_mock.submission.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.depaul.cdm.se452.d2l_mock.submission.entity.Assignment;


public interface AssignmentRepository extends JpaRepository<Assignment, Integer>{

}
