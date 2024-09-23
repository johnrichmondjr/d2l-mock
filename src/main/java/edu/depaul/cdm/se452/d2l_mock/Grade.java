package edu.depaul.cdm.se452.d2l_mock;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Grade {
    @Id
    private int assignmentID;
    private int studentID;
    private int points;
    private String evaluationStatus;
}
