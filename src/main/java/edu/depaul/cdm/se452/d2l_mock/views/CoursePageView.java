package edu.depaul.cdm.se452.d2l_mock;

public class CoursePageView {
    private CourseController courseController;

    public CoursePageView(CourseController courseController) {
        this.courseController = courseController;
    }

    public void displayCoursePage(String courseId) {
        Course course = courseController.getCourse(courseId);
        if (course != null) {
            System.out.println("=== Course Page ===");
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Course ID: " + course.getCourseId());
            System.out.println("Enrolled Users: ");
            
            for (User user : course.getEnrolledUsers()) {
                System.out.println("- " + user.getName() + " (" + user.getRole() + ")");
            }
        } else {
            System.out.println("Course not found.");
        }
    }

    public void enrollUser(String courseId, User user) {
        courseController.enrollUserInCourse(courseId, user);
        System.out.println("User " + user.getName() + " enrolled in course: " + courseId);
    }
}
