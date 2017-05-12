package com.greenfox.aze.reddit.services;

import com.greenfox.aze.reddit.model.Post;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedditPostService {

  @Autowired
  RedditPostRepository redditPostRepository;

  public RedditPostService(RedditPostRepository redditPostRepository) {
    this.redditPostRepository = redditPostRepository;
  }

  public Iterable<Post> list() {
    return redditPostRepository.findAll();
  }


}
