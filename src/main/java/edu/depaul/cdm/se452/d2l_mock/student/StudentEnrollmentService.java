package edu.depaul.cdm.se452.d2l_mock.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

import java.util.List;

@Service
@Log4j2
public class StudentEnrollmentService {
    @Autowired
    private StudentEnrollmentRepository repo;

    public List<StudentEnrollment> list() {
        List<StudentEnrollment> enrollments = repo.findAll();
        return enrollments;
    }

    public void save(StudentEnrollment enrollment) {
        log.info("Prepare saving enrollment", enrollment);
        repo.save(enrollment);
        log.info("Done saving enrollment", enrollment);
    }

    public void delete(long code) {
        log.info("Prepare deleting enrollment", code);
        repo.deleteById(code);
        log.info("Done deleting enrollment");
    }

}
