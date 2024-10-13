package edu.depaul.cdm.se452.d2l_mock.student;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.FetchType;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import edu.depaul.cdm.se452.d2l_mock.course.*;



@Data
@Entity

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentEnrollment  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @ManyToOne(fetch = FetchType.EAGER)
    @ToString.Exclude
    private Course course;
    

    @ManyToOne(fetch = FetchType.EAGER)
    @ToString.Exclude
    private Student student;
}