package edu.depaul.cdm.se452.d2l_mock.course;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "courses")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String description;
    private String instructor;

    // Update course details
    public void updateCourseDetails(String name, String description, String instructor) {
        this.name = name;
        this.description = description;
        this.instructor = instructor;
    }

    // Show course info
    public String displayCourseInfo() {
        return String.format("Course: %s\nDescription: %s\nInstructor: %s", name, description, instructor);
    }
}