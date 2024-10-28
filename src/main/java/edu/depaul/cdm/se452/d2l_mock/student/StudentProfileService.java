package edu.depaul.cdm.se452.d2l_mock.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

import java.util.List;

@Service
@Log4j2
public class StudentProfileService {
    @Autowired
    private StudentProfileRepository repo;

    public List<StudentProfile> list() {
        List<StudentProfile> profiles = repo.findAll();
        return profiles;
    }

    public void save(StudentProfile profile) {
        log.info("Preparing to save profile", profile);
        repo.save(profile);
        log.info("Done deleting profile", profile);
    }

    public void delete(long code) {
        log.info("Preparing to delete profile", code);
        repo.deleteById(code);
        log.info("Done deleting profile");
    }

}
