package edu.depaul.cdm.se452.d2l_mock.student;

import java.io.Serializable;

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

public class StudentProfile implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String nickname;
    private String major;
    private String phonenumber;
    private String email;

    private String employer;
    private String highschool;
    private String title;
    private String university;

    private String birthdate;
    private String goals;
    private String hobbies;
    private String books;

}
