package com.greenfox.aze.reddit.services;


import com.greenfox.aze.reddit.model.Post;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface RedditPostRepository extends CrudRepository<Post, Long> {

  List<Post> findAllBy();



}
