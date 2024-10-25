package edu.depaul.cdm.se452.d2l_mock.discussion_thread;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class PostService {
    @Autowired
    private PostRepository repo;

    public List<Post> list() {
        log.traceEntry("Fetching List of Posts");
        var retval = repo.findAll();
        log.traceExit("Done fetching list of Posts", retval);
        return retval;
    }

    public Post save(Post post) {
        log.traceEntry("Preparing to save Post");
        repo.save(post);
        log.traceExit("Done saving Post", post);
        return post;
    }
}
