package com.greenfox.model;


import javax.validation.constraints.NotNull;

public class Client {

  @NotNull
  private String id;

  public Client(String id) {
    this.id = id;
  }

  public Client() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
