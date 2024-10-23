package edu.depaul.cdm.se452.d2l_mock.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api/announcements")
@Log4j2
public class AnnouncementController {

    @Autowired
    private AnnouncementService announcementService;

    @GetMapping
    public List<Announcement> listAll() {
        return announcementService.listAll();
    }

    @GetMapping("/{id}")
    public Announcement get(@PathVariable long id) {
        return announcementService.get(id);
    }

    @PostMapping
    public Announcement create(@RequestBody Announcement announcement) {
        log.traceEntry("Entering create: {}", announcement);
        Announcement createdAnnouncement = announcementService.save(announcement);
        log.traceExit("Exiting create: {}", createdAnnouncement);
        return createdAnnouncement;
    }

    @PutMapping("/{id}")
    public Announcement update(@PathVariable long id, @RequestBody Announcement announcement) {
        log.traceEntry("Entering update: id={}, announcement={}", id, announcement);
        announcement.setId(id);
        Announcement updatedAnnouncement = announcementService.save(announcement);
        log.traceExit("Exiting update: {}", updatedAnnouncement);
        return updatedAnnouncement;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        log.traceEntry("Entering delete: id={}", id);
        announcementService.delete(id);
        log.traceExit("Exiting delete");
    }
}