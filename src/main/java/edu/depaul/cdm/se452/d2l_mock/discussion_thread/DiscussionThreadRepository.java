package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for DiscussionThread objects
 */
public interface DiscussionThreadRepository extends JpaRepository<DiscussionThread, Long> {
    List<DiscussionThread> findByStudentId(Long studentId);
}
