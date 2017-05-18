package com.greenfox.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ChatMessage {

  @Id
  private Long RandomID;
  private String chatUserName;
  private String text;

  public long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }

  private long timestamp;

  public ChatMessage() {
  }

  public ChatMessage(Long randomID, String chatUserName, String text, long timestamp) {
    RandomID = randomID;
    this.chatUserName = chatUserName;
    this.text = text;
    this.timestamp = timestamp;
  }

  public ChatMessage(String chatUserName, String text, Long randomID) {
    this.chatUserName = chatUserName;
    this.text = text;
    this.RandomID = randomID;
    this.timestamp = timeStamp();

  }

  public Long getRandomID() {
    return RandomID;
  }

  public void setRandomID(Long randomID) {

    RandomID = randomID;
  }

  public String getChatUserName() {
    return chatUserName;
  }

  public void setChatUserName(String chatUserName) {
    this.chatUserName = chatUserName;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public long timeStamp() {
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    return timestamp.getTime();
  }


}
