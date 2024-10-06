package edu.depaul.cdm.se452.d2l_mock.student;


import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentProfileRepo extends JpaRepository<StudentProfile, Long> {

}