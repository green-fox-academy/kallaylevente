package com.kallaylevente.service;

/**
 * Created by Levente on 2017. 05. 04..
 */
public class TwitterService implements MessageService {

  @Override
  public void sendMessage(String address, String msg) {
    System.out.println("Twitter message Sent to " + address + "with Message=" + msg);
  }
}
