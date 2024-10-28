package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.cache.annotation.Cacheable;

@RestController
@RequestMapping("/api/discussion-threads")
public class DiscussionThreadController {
    @Autowired
    private DiscussionThreadService service;

    @GetMapping
    @Cacheable(value = "discussion-threads")
    public List<DiscussionThread> list() {
        return service.list();
    }

    @PostMapping
    public DiscussionThread save(@RequestBody DiscussionThread discussionThread) {
        return service.save(discussionThread);
    }
}
