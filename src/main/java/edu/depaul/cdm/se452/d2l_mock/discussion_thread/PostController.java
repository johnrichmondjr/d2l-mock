package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    @Autowired
    private PostService service;

    @GetMapping
    public List<Post> list() {
        return service.list();
    }

    @PostMapping
    public Post save(@RequestBody Post post) {
        return service.save(post);
    }
}
