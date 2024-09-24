package edu.depaul.cdm.se452.d2l_mock;

import java.util.Date;

public class Submission {
    private int assignmentID;
    private int studentID;
    private String status;
    private Date submissionDate;

    // Getters and Setters
    public int getAssignmentID() {
        return assignmentID;
    }

    public void setAssignmentID(int assignmentID) {
        this.assignmentID = assignmentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    @Override
    public String toString() {
        return "Submission(assignmentID=" + assignmentID + ", studentID=" + studentID + ", status=" + status + ", submissionDate=" + submissionDate + ")";
    }
}


