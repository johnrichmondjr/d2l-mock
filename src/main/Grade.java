package edu.depaul.cdm.se452.d2l_mock;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Grade {
    private int assignmentID;
    private int studentID;
    private int points;
    private String evaluationStatus;
}
