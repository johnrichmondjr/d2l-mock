package edu.depaul.cdm.se452.d2l_mock.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public List<Event> listAll() {
        return eventRepository.findAll();
    }

    public Event get(long id) {
        return eventRepository.findById(id).orElse(null);
    }

    public Event save(Event event) {
        log.traceEntry("Entering save: {}", event);
        Event savedEvent = eventRepository.save(event);
        log.traceExit("Exiting save: {}", savedEvent);
        return savedEvent;
    }

    public void delete(long id) {
        log.traceEntry("Entering delete: id={}", id);
        eventRepository.deleteById(id);
        log.traceExit("Exiting delete");
    }
}