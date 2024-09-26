package edu.depaul.cdm.se452.d2l_mock;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The User class represents a user in the system.
 * 
 * A user can be a student or an administrator, with different roles and permissions.
 * 
 * This class uses Lombok annotations to reduce boilerplate code such as getters, setters,
 * and constructors.
 * 
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    /**
     * The unique identifier for this user.
     */
    private String userId;


    /**
     * The full name of the user.
     */
    private String name;


    /**
     * Role - Can be Student, TA, or Professor.
        * Determines access to the user.
        * STUDENT, STUDENT_ADMIN, COURSE_ADMIN
     */  
    private Role role;


    /**
     * Enum Role defines the possible roles a user can have within the system.
     * 
     * - STUDENT: A user enrolled in one or more courses.
     * - STUDENT_ADMIN: A student who has limited administrative privileges.
     * - COURSE_ADMIN: A user who has administrative control over courses.
     */
    public enum Role {
        STUDENT,
        STUDENT_ADMIN,
        COURSE_ADMIN
    }
}
