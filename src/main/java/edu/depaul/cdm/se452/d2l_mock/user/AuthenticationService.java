package edu.depaul.cdm.se452.d2l_mock.user;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AuthenticationService {
    private static final Logger logger = LoggerFactory.getLogger(AuthenticationService.class);

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private UserRoleRepository userRoleRepo;

    public AppUser registerUser(String username, String password) {
        logger.info("Register user with username:{} ", username);

        Optional<AppUser> existingUser = userRepo.findByUsername(username);
        if (existingUser.isPresent()) {
            logger.warn("Registration failed: User with username '{}' already exists.", username);
            throw new RuntimeException("User already exists");
        }

        UserRole userRole = userRoleRepo.findByAuthority("USER").get();

        Set<UserRole> authorities = new HashSet<>();
        authorities.add(userRole);

        AppUser savedUser = userRepo.save(new AppUser(username, password, authorities));

        logger.info("Successfully registered user with username: {}", username);
        return savedUser;
    }

    public AppUser loginUser(String username, String password) {
        logger.info("login user with username: {}", username);

        Optional<AppUser> user = userRepo.findByUsername(username);
        if (user.isPresent()) {
            AppUser retval = user.get();
            logger.info("Successfully logged in user with username: {}", username);
            return retval;
        } else {
            logger.warn("Login failed: User with username '{}' not found.", username);
            throw new RuntimeException("Invalid username or password");
        }
    }
}