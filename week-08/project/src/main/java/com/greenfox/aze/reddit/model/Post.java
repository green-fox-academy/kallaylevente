package com.greenfox.aze.reddit.model;

import java.sql.Timestamp;
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
  private long timeStamp;
  private int score;
  private String owner;
  private int vote;

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

  public long getTimeStamp() {
    return timeStamp;
  }


  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public Post(String title, String href) {
    this.title = title;
    this.href = href;
    this.timeStamp = timeStamp();
    this.score = 0;

  }

  public Post() {
  }

  public long timeStamp() {
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    return timestamp.getTime();
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public int getVote() {
    return vote;
  }

  public void setVote(int vote) {
    this.vote = vote;
  }
}
