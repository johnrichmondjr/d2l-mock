package edu.depaul.cdm.se452.d2l_mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.depaul.cdm.se452.d2l_mock.student.Student;

public class StudentTest {
    @DisplayName("Test Student")
    @Test
    public void testStudent() {
        List<Integer> Courses = new ArrayList<Integer>();
        Courses.add(1990);
        Courses.add(1991);
        Student Doc = new Student();
        Doc.setCourseID(Courses);
        Doc.setStudentID(12345);
        Doc.setFirstName("Doc");
        Doc.setLastName("Holliday");
        String expectedNoError = "Student(Id=0, CourseID=[1990, 1991], StudentID=12345, firstName=Doc, lastName=Holliday, profile=null)";
        assertEquals(expectedNoError, Doc.toString());
    }

    @DisplayName("Test fullName method")
    @Test
    public void testFullName() {
        Student student = new Student();
        student.setFirstName("Doc");
        student.setLastName("Holliday");
        String expectedNoError = "Doc Holliday";
        assertEquals(expectedNoError, student.getFullName());
    }
}