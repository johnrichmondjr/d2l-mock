package edu.depaul.cdm.se452.d2l_mock.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import lombok.extern.log4j.Log4j2;

@Controller
@RequestMapping("/students/profiles")
@Log4j2
public class StudentProfileController {
    @Autowired
    private StudentProfileService service;

    @GetMapping
    public List<StudentProfile> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public String get(@PathVariable long id, Model model){
        StudentProfile profile = service.findbyId(id);
        model.addAttribute("profile", profile);
        return "students/profile";
    }

    @PostMapping
    public void save(@RequestBody StudentProfile profile) {
        log.info("Saving profile", profile);
        service.save(profile);
        log.info("exit save", profile);
    }

    @DeleteMapping
    public void delete(long code) {
        log.info("Deleting profile", code);
        service.delete(code);
        log.info("Exit delete");
    }

}