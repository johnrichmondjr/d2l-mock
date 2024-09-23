package edu.depaul.cdm.se452.d2l_mock;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

/**
 * The Course class represents a course in the system.
 * 
 * A course contains information about its ID, name, and the users enrolled in it.
 * 
 * This class uses Lombok annotations to generate getters, setters, constructors, and
 * builder methods.
 */


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class Course {

    /**
     * The unique identifier for the course.
     * 
     * This is used to distinguish one course from another.
     */
    private String courseId;



    /**
     * The name of the course.
     * 
     * This provides an easily understood identifier for the course, such as "Math 101."
     */
    private String courseName;



    /**
     * A list of users enrolled in the course.
     * 
     * This list contains instances of the User class, representing students
     * and possibly instructors or administrators.
     * 
     */
    private List<User> enrolledUsers = new ArrayList<>();



    /**
     * Adds a user to the course by enrolling them in the course.
     * 
     * @param user - the user to be enrolled in the course
     */
    public void enrollUser(User user) {
        enrolledUsers.add(user);
    }



    /**
     * Removes a user from the course.
     * 
     * @param user - the user to be removed from the course
     */
    public void removeUser(User user) {
        enrolledUsers.remove(user);
    }
}
