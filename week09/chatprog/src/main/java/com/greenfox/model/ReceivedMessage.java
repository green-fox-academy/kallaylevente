package com.greenfox.model;


import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class ReceivedMessage {

  @Valid
  private ChatMessage message;

  @Valid
  private Client client;

  public ReceivedMessage(ChatMessage message, Client client) {
    this.message = message;
    this.client = client;
  }

  public ReceivedMessage() {
  }

  public ChatMessage getMessage() {
    return message;
  }

  public void setMessage(ChatMessage message) {
    this.message = message;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }
}
