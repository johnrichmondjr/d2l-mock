package edu.depaul.cdm.se452.d2l_mock.submission;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.depaul.cdm.se452.d2l_mock.submission.dto.AssignmentDTO;
import edu.depaul.cdm.se452.d2l_mock.submission.service.AssignmentService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.cache.annotation.Cacheable;

@Controller
@RequestMapping("/submissions")
public class AssignmentController {
    @Autowired
    private AssignmentService service;

    @GetMapping
    @Cacheable(value = "submissions")
    public String list(Model model) {
        List<AssignmentDTO> assignments = service.findAll();
        model.addAttribute("assignments", assignments);

        Map<Long, String> studentNamesByAssignmentId = new HashMap<>();
        for (AssignmentDTO assignment : assignments) {
            String studentFullName = service.getStudentFullName(assignment.assignmentId);
            studentNamesByAssignmentId.put(assignment.assignmentId, studentFullName);
        }

        model.addAttribute("studentNamesByAssignmentId", studentNamesByAssignmentId);

        return "submissions/assignments";
    }

    @PostMapping
public String addAssignment(
    @RequestParam String name,
    @RequestParam String score,
    @RequestParam String dueDate,
    @RequestParam Long courseId,
    @RequestParam Long studentId
) {
    AssignmentDTO newAssignment = AssignmentDTO.builder()
        .name(name)
        .score(score)
        .dueDate(dueDate)
        .courseId(courseId)
        .studentId(studentId)
        .courseName("Course Name")
        .build();

    service.save(newAssignment);
    return "redirect:/submissions";
}

    @GetMapping("/{id}")
    public String get(@PathVariable long id, Model model) {
        AssignmentDTO assignment = service.findById(id);
        model.addAttribute("assignment", assignment);
        return "submissions/assignment";
    }

@PostMapping("/{id}")
public String update(
    @PathVariable long id,
    @RequestParam String name,
    @RequestParam String score,
    @RequestParam String dueDate,
    @RequestParam Long courseId,
    @RequestParam Long studentId
) {

    AssignmentDTO updatedAssignment = AssignmentDTO.builder()
        .assignmentId(id)
        .name(name)
        .score(score)
        .dueDate(dueDate)
        .courseId(courseId)
        .studentId(studentId)
        .courseName("Course Name")
        .build();
    
    service.update(id, updatedAssignment);
    return "redirect:/submissions";
}
}