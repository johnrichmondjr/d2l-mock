package edu.depaul.cdm.se452.d2l_mock;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Submission {
    @Id
    private int assignmentID;
    private int studentID;
    private String status;
    private Date submissionDate;
}

