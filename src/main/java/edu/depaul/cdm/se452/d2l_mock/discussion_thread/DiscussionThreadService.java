package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscussionThreadService {
    @Autowired
    private DiscussionThreadRepository repo;

    public List<DiscussionThread> list() {
        return repo.findAll();
    }

    public DiscussionThread save(DiscussionThread discussionThread) {
        return repo.save(discussionThread);
    }
}
