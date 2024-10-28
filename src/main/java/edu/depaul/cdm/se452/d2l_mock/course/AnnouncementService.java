package edu.depaul.cdm.se452.d2l_mock.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class AnnouncementService {

    @Autowired
    private AnnouncementRepository announcementRepository;

    public List<Announcement> listAll() {
        return announcementRepository.findAll();
    }

    public Announcement get(long id) {
        return announcementRepository.findById(id).orElse(null);
    }

    public Announcement save(Announcement announcement) {
        log.traceEntry("Entering save: {}", announcement);
        Announcement savedAnnouncement = announcementRepository.save(announcement);
        log.traceExit("Exiting save: {}", savedAnnouncement);
        return savedAnnouncement;
    }

    public void delete(long id) {
        log.traceEntry("Entering delete: id={}", id);
        announcementRepository.deleteById(id);
        log.traceExit("Exiting delete");
    }
}