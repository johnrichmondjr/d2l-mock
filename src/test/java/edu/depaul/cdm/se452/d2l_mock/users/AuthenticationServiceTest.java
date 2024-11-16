package edu.depaul.cdm.se452.d2l_mock.users;

import static org.junit.jupiter.api.Assertions.*;

import edu.depaul.cdm.se452.d2l_mock.user.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AuthenticationServiceTest {

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private UserRoleRepository userRoleRepo;

    private AppUser user;

    @BeforeEach
    void setUp() {
        userRepo.deleteAll();
    }
    @Test
    void testRegisterUser_Success() {
        String username = "john";
        String password = "john123";

        AppUser registeredUser = authenticationService.registerUser(username, password);

        assertNotNull(registeredUser);
        assertEquals(username, registeredUser.getUsername());
    }
}
