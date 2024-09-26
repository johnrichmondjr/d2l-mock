package edu.depaul.cdm.se452.d2l_mock;

import org.springframework.stereotype.Service;

import java.util.*;

/**
 * CourseService is a service layer responsible for handling the business logic
 * related to courses. 
 * 
 * It manages a collection of Course objects, allowing for
    * retrieval, enrollment, and listing of courses.
 */


@Service

public class CourseService {



    // A map that holds the courses, keyed by their unique course IDs.
    private final Map<String, Course> courses = new HashMap<>();


    /**
     * Retrieves a course by its unique ID.
     * 
     * @param courseId - the unique ID of the course to retrieve
     * @return the Course object if found, or null if no course with the given ID exists
     */


    public Course getCourseById(String courseId) {
        return courses.get(courseId);
    }


    
    /*
     * Enrolls a user in a specified course.
     * This method finds the course by its ID and adds the user to the course's list
     * of enrolled users, if the course exists.
     * 
     * @param courseId - the ID of the course in which the user should be enrolled
     * @param user - the User object representing the user to be enrolled
     */

    public void enrollUser(String courseId, User user) {

        Course course = courses.get(courseId);

        /* If the course exists, add the user */
        if (course != null) {
            course.getEnrolledUsers().add(user);
        }
    }



    /**
     * Retrieves a list of all courses available in the system.
     * 
     * @return a list of all Course objects currently in the system
     */

    public List<Course> getAllCourses() {
        
        return new ArrayList<>(courses.values());
    }



    /**
     * Adds a new course to the system.
     * 
     * This method is useful for populating the course catalog with new courses.
     * 
     * @param course - the Course object to be added to the system
     */

    public void addCourse(Course course) {
        /* New class! Woohoo! */
        courses.put(course.getCourseId(), course);
    }
}
