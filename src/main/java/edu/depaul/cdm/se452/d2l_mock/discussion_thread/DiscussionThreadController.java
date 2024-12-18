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

@Controller
@RequestMapping("/discussion-threads")
public class DiscussionThreadController {
    @Autowired
    private DiscussionThreadService threadService;

    @GetMapping
    public String list(Model model) {
        List<DiscussionThread> threads = threadService.list();
        model.addAttribute("threads", threads);
        return "discussion_thread/list";
    }

    @GetMapping("/{id}")
    public String get(@PathVariable long id, Model model) {
        DiscussionThread thread = threadService.findById(id);
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
        threadService.save(thread);
        model.addAttribute("thread", thread);
        return "discussion_thread/show";
    }

    @GetMapping("/{id}/new-post")
    public String createPost(@PathVariable long id, Model model) {
        DiscussionThread thread = threadService.findById(id);
        model.addAttribute("thread", thread);
        model.addAttribute("post", new Post());
        return "discussion_thread/new_post";
    }
}
