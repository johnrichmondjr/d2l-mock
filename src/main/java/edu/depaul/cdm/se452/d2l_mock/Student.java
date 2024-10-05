package edu.depaul.cdm.se452.d2l_mock;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    private String birthdate;
    private int StudentID;
    private String firstName;
    private String lastName;
    private boolean isAdmin;

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
