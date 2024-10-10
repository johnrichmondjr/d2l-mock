package edu.depaul.cdm.se452.d2l_mock.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/register")
    public AppUser register(@RequestParam String username, @RequestParam String password) {
        return authenticationService.registerUser(username, password);
    }

    @PostMapping("/login")
    public AppUser login(@RequestParam String username, @RequestParam String password) {
        return authenticationService.loginUser(username, password);
    }
}
