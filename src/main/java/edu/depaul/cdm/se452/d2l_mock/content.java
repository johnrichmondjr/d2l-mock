package edu.depaul.cdm.se452.d2l_mock;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Content {
    @Id
    private int contentID;
    private String title;
    private String description;
    private int courseID;
}

