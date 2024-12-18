package edu.depaul.cdm.se452.d2l_mock.submission.rest;
import edu.depaul.cdm.se452.d2l_mock.submission.service.AssignmentService;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.depaul.cdm.se452.d2l_mock.submission.dto.AssignmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api")
public class AssignmentRestController {

    @Autowired
    private AssignmentService assignmentService;

    @GetMapping("/assignments")
    public ResponseEntity<List<AssignmentDTO>> getAssignments() {
        List<AssignmentDTO> assignments = assignmentService.findAll();
        return ResponseEntity.ok(assignments);
    }
    
    @GetMapping("/assignments/{id}")
    public ResponseEntity<AssignmentDTO> getById(@PathVariable Long id) {
        AssignmentDTO assignment = assignmentService.findById(id);
        return ResponseEntity.ok(assignment);
    }

    @GetMapping("/assignments/by-course/{id}")
    public ResponseEntity<List<AssignmentDTO>> getByCourse(@PathVariable Long id) {
        List<AssignmentDTO> assignments = assignmentService.findByCourse(id);
        return ResponseEntity.ok(assignments);
    }
  
    @PostMapping("/assignments")
    public ResponseEntity<AssignmentDTO> save(@RequestBody AssignmentDTO dto) {       
        AssignmentDTO savedAssignment = assignmentService.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAssignment);
    }

    @PutMapping("/assignments/{id}")
    public ResponseEntity<AssignmentDTO> update(@PathVariable Long id, @RequestBody AssignmentDTO dto) {       
        AssignmentDTO updatedAssignment = assignmentService.update(id, dto);
        return ResponseEntity.ok(updatedAssignment);
    }
}
