package edu.depaul.cdm.se452.d2l_mock;

public class Content {
    private int contentID;
    private String title;
    private String description;
    private int courseID;

    // Getters and Setters
    public int getContentID() {
        return contentID;
    }

    public void setContentID(int contentID) {
        this.contentID = contentID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    @Override
    public String toString() {
        return "Content(contentID=" + contentID + ", title=" + title + ", description=" + description + ", courseID=" + courseID + ")";
    }
}




