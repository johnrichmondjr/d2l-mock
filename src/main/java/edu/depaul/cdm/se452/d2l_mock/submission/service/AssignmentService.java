package edu.depaul.cdm.se452.d2l_mock.submission.service;

import java.util.List;
import edu.depaul.cdm.se452.d2l_mock.submission.entity.Assignment;


public interface AssignmentService {

    List<Assignment> findAll();

    Assignment findById(int id);

    Assignment save(Assignment entity);

    //TODO find by course id
}
