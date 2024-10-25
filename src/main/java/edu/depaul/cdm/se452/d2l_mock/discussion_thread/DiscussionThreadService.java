package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class DiscussionThreadService {
    @Autowired
    private DiscussionThreadRepository repo;

    public List<DiscussionThread> list() {
        log.traceEntry("Fetching List of Discussion Threads");
        var retval = repo.findAll();
        log.traceExit("Done fetching list of Discussion Threads", retval);
        return retval;
    }

    public DiscussionThread save(DiscussionThread discussionThread) {
        log.traceEntry("Preparing to save Discussion Thread");
        repo.save(discussionThread);
        log.traceExit("Done saving Discussion Thread", discussionThread);
        return discussionThread;
    }
}
