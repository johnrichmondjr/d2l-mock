package edu.depaul.cdm.se452.d2l_mock.submission.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.depaul.cdm.se452.d2l_mock.submission.dao.AssignmentRepository;
import edu.depaul.cdm.se452.d2l_mock.submission.entity.Assignment;

@Service
public class AssignmentServiceImpl implements AssignmentService{

    private AssignmentRepository assignmentRepository;

    @Autowired
    public AssignmentServiceImpl(AssignmentRepository repo){
        this.assignmentRepository = repo;
    }


    @Override
    public List<Assignment> findAll() {
        return assignmentRepository.findAll();
    }

    @Override
    public Assignment findById(int id) {
        Assignment assignment = assignmentRepository.findById(id).orElse(null);

        return assignment;
    }

    @Override
    public Assignment save(Assignment entity) {
        return assignmentRepository.save(entity);
    }

}
