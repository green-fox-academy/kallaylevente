package com.greenfox.aze.reddit.model;

import java.util.List;

/**
 * Created by Levente on 2017. 05. 12..
 */
public class ListOfPosts {

  private Iterable<Post> posts;

  public ListOfPosts() {

  }

  public Iterable<Post> getPosts() {
    return posts;
  }

  public void setPosts(Iterable<Post> posts) {
    this.posts = posts;
  }
}
