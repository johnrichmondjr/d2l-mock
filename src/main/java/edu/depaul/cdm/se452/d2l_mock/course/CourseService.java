package edu.depaul.cdm.se452.d2l_mock.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> listAll() {
        return courseRepository.findAll();
    }

    public Course get(long id) {
        return courseRepository.findById(id).orElse(null);
    }

    public Course save(Course course) {
        log.traceEntry("Entering save: {}", course);
        Course savedCourse = courseRepository.save(course);
        log.traceExit("Exiting save: {}", savedCourse);
        return savedCourse;
    }

    public void delete(long id) {
        log.traceEntry("Entering delete: id={}", id);
        courseRepository.deleteById(id);
        log.traceExit("Exiting delete");
    }
}