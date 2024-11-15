package edu.depaul.cdm.se452.d2l_mock.submission.service;

import java.util.List;
import edu.depaul.cdm.se452.d2l_mock.submission.dto.AssignmentDTO;


public interface AssignmentService {

    List<AssignmentDTO> findAll();

    AssignmentDTO findById(Long id);

    List<AssignmentDTO> findByCourse(Long id);

    AssignmentDTO save(AssignmentDTO dto);

    AssignmentDTO update(Long id, AssignmentDTO dto);

    String getStudentFullName(Long id);
}
