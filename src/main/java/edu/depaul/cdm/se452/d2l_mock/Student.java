package edu.depaul.cdm.se452.d2l_mock;

import edu.depaul.cdm.se452.d2l_mock.discussion_thread.Poster;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student implements Poster {
    private String birthdate;
    private int StudentID;
    private String firstName;
    private String lastName;
    private boolean isAdmin;

    @Override
    public String getFullName() {
        return firstName + " " + lastName;
    }
}
