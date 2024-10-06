package edu.depaul.cdm.se452.d2l_mock.student;

import java.util.List;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    //TODO: tie this with Dylan's Course classes
    private List<Integer> CourseID;
    private int StudentID;
    private String firstName;
    private String lastName;

    @OneToOne
    @JoinColumn(name = "profile_id")
    private StudentProfile profile;

    public String getFullName() {
        return firstName + " " + lastName;
    }
}