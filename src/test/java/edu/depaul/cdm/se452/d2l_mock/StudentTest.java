package edu.depaul.cdm.se452.d2l_mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @DisplayName("Test simple Lombok")
    @Test
    public void testLombok() {
        Student Doc = new Student();
        Doc.setBirthdate("8/14/1851");
        Doc.setStudentID(12345);
        Doc.setFirstName("Doc");
        Doc.setLastName("Holliday");
        Doc.setAdmin(false);
        String expectedNoError = "Student(birthdate=8/14/1851, StudentID=12345, firstName=Doc, lastName=Holliday, isAdmin=false)";
        assertEquals(expectedNoError, Doc.toString());
    }       


}
