package edu.depaul.cdm.se452.d2l_mock.student;

import edu.depaul.cdm.se452.d2l_mock.discussion_thread.Poster;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Student implements Poster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String birthdate;
    private int StudentID;
    private String firstName;
    private String lastName;

    @Override
    public String getFullName() {
        return firstName + " " + lastName;
    }
}
