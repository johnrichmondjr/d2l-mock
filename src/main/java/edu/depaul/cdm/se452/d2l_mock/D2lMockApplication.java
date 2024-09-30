package edu.depaul.cdm.se452.d2l_mock;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import edu.depaul.cdm.se452.d2l_mock.discussion_thread.DiscussionThreadRepository;
import edu.depaul.cdm.se452.d2l_mock.discussion_thread.DiscussionThread;

import edu.depaul.cdm.se452.d2l_mock.student.StudentRepo;
import edu.depaul.cdm.se452.d2l_mock.student.Student;

@SpringBootApplication
public class D2lMockApplication {

	public static void main(String[] args) {
		SpringApplication.run(D2lMockApplication.class, args);
	}

	@Bean
	CommandLineRunner addDiscussionThreadUserRun(DiscussionThreadRepository threadRepo) {
		return args -> {
			threadRepo.save(DiscussionThread.builder().title("Discussion Thread 1").build());
		};
	}

	@Bean
	CommandLineRunner addStudentRun(StudentRepo stuRepo) {
		return args -> {
			stuRepo.save(Student.builder().birthdate("8/14/1851").StudentID(12345).firstName("Doc").lastName("Holliday").build());
		};
	}

}
