package com.greenfox.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Levente on 2017. 05. 09..
 */

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long ID;

  private String title;
  private boolean urgent = false;
  private boolean active = false;

  public Todo(String title) {
    this.title = title;
  }

  public Todo() {
  }

  public long getID() {
    return ID;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  @Override
  public String toString() {
    return title;
  }
}
