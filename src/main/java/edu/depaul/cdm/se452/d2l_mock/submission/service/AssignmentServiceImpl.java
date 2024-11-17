package edu.depaul.cdm.se452.d2l_mock.submission.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.depaul.cdm.se452.d2l_mock.submission.AssignmentRepository;
import edu.depaul.cdm.se452.d2l_mock.submission.dto.AssignmentDTO;
import jakarta.persistence.EntityNotFoundException;
import edu.depaul.cdm.se452.d2l_mock.course.Course;
import edu.depaul.cdm.se452.d2l_mock.course.CourseRepository;
import edu.depaul.cdm.se452.d2l_mock.student.Student;
import edu.depaul.cdm.se452.d2l_mock.student.StudentRepository;
import edu.depaul.cdm.se452.d2l_mock.submission.Assignment;

@Service
public class AssignmentServiceImpl implements AssignmentService{

    @Autowired
    private AssignmentRepository assignmentRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<AssignmentDTO> findAll() {
        // Convert assignments to list of dto
        List<Assignment> assignments = assignmentRepository.findAll();
        List<AssignmentDTO> dtoList = new ArrayList<>();

        for (Assignment entity : assignments){
            AssignmentDTO dto = mapToDTO(entity);
            dtoList.add(dto);
        }

        return dtoList;
    }

    


    @Override
    public AssignmentDTO findById(Long id) {
        Assignment assignment = new Assignment();

        assignment = assignmentRepository.findById(id)
                    .orElseThrow(() -> new EntityNotFoundException("Assignment not found"));
        return mapToDTO(assignment);
    }

    @Override
    public List<AssignmentDTO> findByCourse(Long id) {
        return assignmentRepository.findAssignmentsByCourse(id);
    }

    @Override
    public String getStudentFullName(Long assignmentId) {
        Assignment assignment = assignmentRepository.findById(assignmentId).orElse(null);

        if (assignment != null){
        String student = assignment.getStudent().getFullName();
        return student;
        }

        return null;
    }

    @Override
    public AssignmentDTO save(AssignmentDTO dto) {
        Assignment assignment = mapToEntity(dto);
        Assignment savedAssignment = assignmentRepository.save(assignment);
        AssignmentDTO returnedAssignment = mapToDTO(assignmentRepository.findById(savedAssignment.getAssignmentId()).orElse(null));
        
        return returnedAssignment;
    }

    @Override
    public AssignmentDTO update(Long id, AssignmentDTO dto) {

        assignmentRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Assignment not found"));
            
        // Check if dto id matches endpoint id
        if(id != dto.assignmentId){
            throw new EntityNotFoundException("Id mismatch");
        }

        Assignment assignment = mapToEntity(dto);
        Assignment savedAssignment = assignmentRepository.save(assignment);
        AssignmentDTO returnedAssignment = mapToDTO(assignmentRepository.findById(savedAssignment.getAssignmentId()).orElse(null));
        
        return returnedAssignment;
    }

    private AssignmentDTO mapToDTO(Assignment entity) {
        return AssignmentDTO.builder()
            .courseId(entity.getCourse().getId())
            .dueDate(entity.getDueDate())
            .assignmentId(entity.getAssignmentId())
            .score(entity.getScore())
            .studentId(entity.getStudent().getId())
            .name(entity.getName())
            .courseName(entity.getCourse().getName())
            .build();
    }
    
    private Assignment mapToEntity(AssignmentDTO dto) {
        Assignment assignment;

        // Update if assignmentId is found, otherwise create new assignment
        if (dto.assignmentId != null){
        assignment = assignmentRepository.findById(dto.assignmentId)
            .orElse(assignment = new Assignment());
        }
        else{assignment = new Assignment();
        }

        // Set fields from DTO
        assignment.setDueDate(dto.dueDate);
        assignment.setScore(dto.score);
        assignment.setName(dto.name);

        // Set student and course based on ID's. Throw exception if not found
        Student student = studentRepository.findById(dto.studentId)
                .orElseThrow(() -> new EntityNotFoundException("Student not found"));
        Course course = courseRepository.findById(dto.courseId)
                .orElseThrow(() -> new EntityNotFoundException("Course not found"));

        assignment.setStudent(student);
        assignment.setCourse(course);

        return assignment;
    }


}
