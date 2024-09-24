package edu.depaul.cdm.se452.d2l_mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Submissiontest {
    @DisplayName("Test Lombok for Submission")
    @Test
    public void testSubmissionLombok() {
        Submission submission = new Submission();
        submission.setAssignmentID(2001);
        submission.setStudentID(12345);
        submission.setStatus("Not submitted");
        submission.setSubmissionDate(null);

        String expectedSubmissionString = "Submission(assignmentID=2001, studentID=12345, status=Not submitted, submissionDate=null)";
        assertEquals(expectedSubmissionString, submission.toString());
    }
}
