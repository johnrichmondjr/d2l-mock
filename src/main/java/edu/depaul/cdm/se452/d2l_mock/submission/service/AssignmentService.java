package edu.depaul.cdm.se452.d2l_mock.submission.service;

import java.util.List;
import edu.depaul.cdm.se452.d2l_mock.submission.Assignment;
import edu.depaul.cdm.se452.d2l_mock.submission.dto.AssignmentDTO;


public interface AssignmentService {

    List<AssignmentDTO> findAll();

    AssignmentDTO findById(Long id);

    Assignment save(AssignmentDTO dto);

    Assignment update(Long id, AssignmentDTO dto);

    //TODO find by course id
}
