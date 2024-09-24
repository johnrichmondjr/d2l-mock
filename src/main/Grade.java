package edu.depaul.cdm.se452.d2l_mock;

public class Grade {
    private int assignmentID;
    private int studentID;
    private int points;
    private String evaluationStatus;

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

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getEvaluationStatus() {
        return evaluationStatus;
    }

    public void setEvaluationStatus(String evaluationStatus) {
        this.evaluationStatus = evaluationStatus;
    }

    @Override
    public String toString() {
        return "Grade(assignmentID=" + assignmentID + ", studentID=" + studentID + ", points=" + points + ", evaluationStatus=" + evaluationStatus + ")";
    }
}
