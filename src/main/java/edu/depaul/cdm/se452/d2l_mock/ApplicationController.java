package edu.depaul.cdm.se452.d2l_mock;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }
}
