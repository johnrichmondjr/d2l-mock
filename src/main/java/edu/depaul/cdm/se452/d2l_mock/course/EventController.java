package edu.depaul.cdm.se452.d2l_mock.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/events")
@Log4j2
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping
    public List<Event> listAll() {
        return eventService.listAll();
    }

    @GetMapping("/{id}")
    public Event get(@PathVariable long id) {
        return eventService.get(id);
    }

    @PostMapping
    public Event create(@RequestBody Event event) {
        log.traceEntry("Entering create: {}", event);
        Event createdEvent = eventService.save(event);
        log.traceExit("Exiting create: {}", createdEvent);
        return createdEvent;
    }

    @PutMapping("/{id}")
    public Event update(@PathVariable long id, @RequestBody Event event) {
        log.traceEntry("Entering update: id={}, event={}", id, event);
        event.setId(id);
        Event updatedEvent = eventService.save(event);
        log.traceExit("Exiting update: {}", updatedEvent);
        return updatedEvent;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        log.traceEntry("Entering delete: id={}", id);
        eventService.delete(id);
        log.traceExit("Exiting delete");
    }
}