package edu.depaul.cdm.se452.d2l_mock.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/courses")
@Log4j2
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> listAll() {
        return courseService.listAll();
    }

    @GetMapping("/{id}")
    public Course get(@PathVariable long id) {
        return courseService.get(id);
    }

    @PostMapping
    public Course create(@RequestBody Course course) {
        log.traceEntry("Entering create: {}", course);
        Course createdCourse = courseService.save(course);
        log.traceExit("Exiting create: {}", createdCourse);
        return createdCourse;
    }

    @PutMapping("/{id}")
    public Course update(@PathVariable long id, @RequestBody Course course) {
        log.traceEntry("Entering update: id={}, course={}", id, course);
        course.setId(id);
        Course updatedCourse = courseService.save(course);
        log.traceExit("Exiting update: {}", updatedCourse);
        return updatedCourse;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        log.traceEntry("Entering delete: id={}", id);
        courseService.delete(id);
        log.traceExit("Exiting delete");
    }
}