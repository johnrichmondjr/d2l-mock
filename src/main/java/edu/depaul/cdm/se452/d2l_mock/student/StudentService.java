package edu.depaul.cdm.se452.d2l_mock.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

import java.util.List;

@Service
@Log4j2
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public List<Student> list() {
        List<Student> students = repo.findAll();
        return students;
    }

    public void save(Student student) {
        log.info("Preparing to save student", student);
        repo.save(student);
        log.info("exit save", student);
    }

    public void delete(long code) {
        log.info("Preparing to delete student", code);
        repo.deleteById(code);
        log.info("Exit delete");
    }

}
