package edu.depaul.cdm.se452.d2l_mock.submission.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.depaul.cdm.se452.d2l_mock.submission.entity.Assignment;
import edu.depaul.cdm.se452.d2l_mock.submission.service.AssignmentService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api")
public class AssignmentRestController {

    private AssignmentService assignmentService;

    public AssignmentRestController(AssignmentService service){
        this.assignmentService = service;
    }

    @GetMapping("/assignments")
    public List<Assignment> getAssignments() {
        return assignmentService.findAll();
    }

    @GetMapping("/assignments/{id}")
    public Assignment getById(@PathVariable int id) {
        return assignmentService.findById(id);
    }
}
