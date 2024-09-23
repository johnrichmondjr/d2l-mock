package edu.depaul.cdm.se452.d2l_mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Gradetest {
    @DisplayName("Test Lombok for Grade")
    @Test
    public void testGradeLombok() {
        Grade grade = new Grade();
        grade.setAssignmentID(2001);
        grade.setStudentID(12345);
        grade.setPoints(-100);
        grade.setEvaluationStatus("Not evaluated");

        String expectedGradeString = "Grade(assignmentID=2001, studentID=12345, points=-100, evaluationStatus=Not evaluated)";
        assertEquals(expectedGradeString, grade.toString());
    }
}
