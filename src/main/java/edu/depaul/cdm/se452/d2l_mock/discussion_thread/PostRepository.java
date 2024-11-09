package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByStudentId(long studentId);
}
