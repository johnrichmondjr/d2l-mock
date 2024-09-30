package edu.depaul.cdm.se452.d2l_mock.course;

import edu.depaul.cdm.se452.d2l_mock.course.Announcements.Announcement;
import edu.depaul.cdm.se452.d2l_mock.course.Announcements.AnnouncementRepository;
import edu.depaul.cdm.se452.d2l_mock.course.Events.Event;
import edu.depaul.cdm.se452.d2l_mock.course.Events.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CoursePage {
    private final AnnouncementRepository announcementRepository;
    private final EventRepository eventRepository;

    // Constructor-based dependency injection of AnnouncementRepository and EventRepository
    @Autowired
    public CoursePage(AnnouncementRepository announcementRepository, EventRepository eventRepository) {
        this.announcementRepository = announcementRepository;
        this.eventRepository = eventRepository;
    }

    // Method to display the course name
    public void displayCourseName(String courseName) {
        System.out.println("Course Name: " + courseName);
    }

    // Method to display announcements for a given course ID
    public void displayAnnouncements(Long courseId) {
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

    // Method to display a calendar widget
    public void displayCalendar() {
        // Implement calendar display logic here
        System.out.println("Calendar Widget");
    }

    // Method to display upcoming events for a given course ID
    public void displayUpcomingEvents(Long courseId) {
        // Fetch events for the course, ordered by event date in ascending order
        List<Event> events = eventRepository.findByCourseIdOrderByEventDateAsc(courseId);
        // Print each event's details to the console
        for (Event event : events) {
            System.out.println("Date: " + event.getEventDate());
            System.out.println("Title: " + event.getTitle());
            System.out.println("Description: " + event.getDescription());
            System.out.println();
        }
    }
}