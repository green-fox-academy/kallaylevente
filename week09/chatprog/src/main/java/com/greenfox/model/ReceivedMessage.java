package com.greenfox.model;


public class ReceivedMessage {

  private ChatMessage message;
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
