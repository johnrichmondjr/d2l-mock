package edu.depaul.cdm.se452.d2l_mock;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Submission {
    private int assignmentID;
    private int studentID;
    private String status;
    private Date submissionDate;
}

