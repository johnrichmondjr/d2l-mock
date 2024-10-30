package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.cache.annotation.Cacheable;

@Controller
@RequestMapping("/discussion-threads")
public class DiscussionThreadController {
    @Autowired
    private DiscussionThreadService service;

    @GetMapping
    @Cacheable(value = "discussion-threads")
    public String list(Model model) {
        List<DiscussionThread> threads = service.list();
        model.addAttribute("threads", threads);
        return "discussion_thread/list";
    }

    @GetMapping("/{id}")
    public String get(@PathVariable long id, Model model) {
        DiscussionThread thread = service.findById(id);
        model.addAttribute("thread", thread);
        return "discussion_thread/show";
    }

    @GetMapping("/new")
    public String create(Model model) {
        model.addAttribute("thread", new DiscussionThread());
        return "discussion_thread/new";
    }

    @PostMapping("/new")
    public String create(@ModelAttribute DiscussionThread thread, Model model) {
        service.save(thread);
        model.addAttribute("thread", thread);
        return "discussion_thread/show";
    }
}
