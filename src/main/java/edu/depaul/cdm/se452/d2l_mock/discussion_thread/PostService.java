package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    private PostRepository repo;

    public List<Post> list() {
        return repo.findAll();
    }

    public Post save(Post post) {
        return repo.save(post);
    }
}
