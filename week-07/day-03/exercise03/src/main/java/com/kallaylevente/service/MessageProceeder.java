package com.kallaylevente.service;

/**
 * Created by Levente on 2017. 05. 04..
 */
public class MessageProceeder {

  public void processMessage(String msg, String mail) {
    System.out.println("Email Sent to " + mail + "with Message=" + msg);
  }
}

