package com.kallaylevente.service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Levente on 2017. 05. 04..
 */
public class MessageProceeder {

  @Autowired
  MessageService messageService;

  public void processMessage(String msg, String address) {
    messageService.sendMessage(msg,address);
  }


}

