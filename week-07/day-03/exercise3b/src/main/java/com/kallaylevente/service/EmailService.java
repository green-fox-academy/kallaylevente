package com.kallaylevente.service;


public class EmailService implements MessageService {

  public void sendMessage(String address, String msg) {
    System.out.println("Email Sent to " + address + "with Message=" + msg);
  }

}


