package edu.depaul.cdm.se452.d2l_mock.student;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/students")
@Log4j2
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping
    public List<Student> list() {
        return service.list();
    }

    @PostMapping
    public void save(@RequestBody Student student) {
        log.info("Saving student", student);
        service.save(student);
        log.info("exit save", student);
    }

    @DeleteMapping
    public void delete(long code) {
        log.info("Deleting student", code);
        service.delete(code);
        log.info("Exit delete");
    }

}
