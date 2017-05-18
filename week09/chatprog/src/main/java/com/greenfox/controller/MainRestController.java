package com.greenfox.controller;

import com.greenfox.model.ChatMessage;
import com.greenfox.model.Client;
import com.greenfox.model.ErrorMessage;
import com.greenfox.model.ReceivedMessage;
import com.greenfox.model.Status;
import com.greenfox.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @Autowired
  MessageRepository messageRepository;

  @ExceptionHandler(MissingServletRequestParameterException.class)
  @ResponseStatus(code = HttpStatus.UNAUTHORIZED)
  public ErrorMessage MissingBodyParamter() {
    return new ErrorMessage("test","test2");
  }

  @RequestMapping(value = "/api/message/receive", method = RequestMethod.POST)
  public Object receiveMessage(@RequestBody(required = true) ReceivedMessage receivedMessage ) {
    ReceivedMessage receivedMessage1 = new ReceivedMessage(receivedMessage.getMessage(),
        receivedMessage.getClient());
    ChatMessage chatMessage = receivedMessage1.getMessage();
    Long temp = 0L;
    do {
      temp = (long) (1000000 + (Math.random() * 1000000));
    } while (messageRepository.exists(temp));
    chatMessage.setRandomID(temp);
    chatMessage.setChatUserName(receivedMessage1.getClient().getId());
    messageRepository.save(chatMessage);
    return new Status("ok");
  }
}
