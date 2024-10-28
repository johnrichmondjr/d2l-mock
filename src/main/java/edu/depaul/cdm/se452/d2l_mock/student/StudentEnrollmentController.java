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
@RequestMapping("/api/enrollments")
@Log4j2
public class StudentEnrollmentController {
    @Autowired
    private StudentEnrollmentService service;

    @GetMapping
    public List<StudentEnrollment> list() {
        return service.list();
    }

    @PostMapping
    public void save(@RequestBody StudentEnrollment enrollment) {
        log.info("Saving enrollment", enrollment);
        service.save(enrollment);
        log.info("exit save", enrollment);
    }

    @DeleteMapping
    public void delete(long code) {
        log.info("Deleting enrollment", code);
        service.delete(code);
        log.info("Exit delete");
    }

}
