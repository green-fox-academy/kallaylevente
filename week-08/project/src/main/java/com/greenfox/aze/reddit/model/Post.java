package com.greenfox.aze.reddit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Post {


  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long ID;

  private String title;
  private String href;
  private String timeStamp;
  private int score;

  public Long getID() {
    return ID;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public String getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public Post(String title, String href, String timeStamp) {
    this.title = title;
    this.href = href;
    this.timeStamp = timeStamp;
    this.score = 0;
  }

  public Post() {
  }
}
