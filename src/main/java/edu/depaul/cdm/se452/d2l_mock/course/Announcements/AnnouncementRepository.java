package edu.depaul.cdm.se452.d2l_mock.course.Announcements;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Repository interface for Announcement entity
public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {
    // Custom query method to find announcements by course ID, ordered by timestamp in descending order
    List<Announcement> findByCourseIdOrderByTimestampDesc(Long courseId);
}