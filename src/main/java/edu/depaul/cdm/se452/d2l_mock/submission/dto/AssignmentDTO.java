package edu.depaul.cdm.se452.d2l_mock.submission.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;

@AllArgsConstructor
@Builder
public class AssignmentDTO {
    
    public final Long assignmentId;

    @NonNull
    public final String score;

    @NonNull
    public final String name;

    @NonNull
    public final String dueDate;

    @NonNull
    public final Long courseId;

    @NonNull
    public final String courseName;

    @NonNull
    public final Long studentId;
}
