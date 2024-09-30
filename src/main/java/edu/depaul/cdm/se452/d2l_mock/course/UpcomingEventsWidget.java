package edu.depaul.cdm.se452.d2l_mock.course;

import edu.depaul.cdm.se452.d2l_mock.course.Events.Event;
import edu.depaul.cdm.se452.d2l_mock.course.Events.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UpcomingEventsWidget {
    private final EventRepository eventRepository;

    @Autowired
    public UpcomingEventsWidget(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public void display(Long courseId) {
        List<Event> events = eventRepository.findByCourseIdOrderByEventDateAsc(courseId);
        for (Event event : events) {
            System.out.println("Date: " + event.getEventDate());
            System.out.println("Title: " + event.getTitle());
            System.out.println("Description: " + event.getDescription());
            System.out.println();
        }
    }
}