package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @Autowired
    private DiscussionThreadService threadService;

    @PostMapping("/new")
    public String save(@ModelAttribute Post post, @RequestParam(name = "discussionThreadID") String discussionThreadID,
            Model model) {

        Long longThreadID = Long.parseLong(discussionThreadID);
        DiscussionThread thread = threadService.findById(longThreadID);
        post.setDiscussionThread(thread);
        postService.save(post);

        thread.getPosts().add(post);
        threadService.save(thread);

        model.addAttribute("thread", thread);
        return "discussion_thread/show";
    }
}
