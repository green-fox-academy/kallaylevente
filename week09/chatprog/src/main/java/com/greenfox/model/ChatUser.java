package com.greenfox.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ChatUser {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer iD;

  private String chatUserName;

  public ChatUser(String chatUserName) {
    this.chatUserName = chatUserName;
  }

  public ChatUser() {
  }

  public String getChatUserName() {
    return chatUserName;
  }

  public void setChatUserName(String chatUserName) {
    this.chatUserName = chatUserName;
  }
}
