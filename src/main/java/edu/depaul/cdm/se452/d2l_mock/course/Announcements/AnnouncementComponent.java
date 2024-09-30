package edu.depaul.cdm.se452.d2l_mock.course.Announcements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnnouncementComponent {
    private final AnnouncementRepository announcementRepository;

    // Constructor-based dependency injection of AnnouncementRepository
    @Autowired
    public AnnouncementComponent(AnnouncementRepository announcementRepository) {
        this.announcementRepository = announcementRepository;
    }

    // Method to display announcements for a given course ID
    public void display(Long courseId) {
        // Fetch announcements for the course, ordered by timestamp in descending order
        List<Announcement> announcements = announcementRepository.findByCourseIdOrderByTimestampDesc(courseId);
        // Print each announcement's details to the console
        for (Announcement announcement : announcements) {
            System.out.println("Title: " + announcement.getTitle());
            System.out.println("Posted: " + announcement.getTimestamp());
            System.out.println("Content: " + announcement.getContent());
            System.out.println();
        }
    }
}