package com.greenfox.controller;

import com.greenfox.model.ChatMessage;
import com.greenfox.model.Client;
import com.greenfox.model.ErrorMessage;
import com.greenfox.model.RandomIdGenerator;
import com.greenfox.model.ReceivedMessage;
import com.greenfox.model.Status;
import com.greenfox.repository.MessageRepository;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @Autowired
  private RandomIdGenerator randomNumberGenerator;

  @Autowired
  private MessageRepository messageRepository;

  @ExceptionHandler(MethodArgumentNotValidException.class)
  @ResponseStatus(code = HttpStatus.UNAUTHORIZED)
  public ErrorMessage MissingBodyParamter(MethodArgumentNotValidException e) {
    String temp = "Missing field(s): ";
    List<FieldError> errors = e.getBindingResult().getFieldErrors();
    for (FieldError error : errors) {
      temp = temp.concat(error.getField() + ", ");
    }
    return new ErrorMessage(temp);
  }


  @RequestMapping(value = "/api/message/receive", method = RequestMethod.POST)
  public Object receiveMessage(@RequestBody @Valid ReceivedMessage receivedMessage) {
    ChatMessage chatMessage = receivedMessage.getMessage();
    Client client = receivedMessage.getClient();
    chatMessage.setRandomID(randomNumberGenerator.generateRandomIdNumber(messageRepository));
    messageRepository.save(chatMessage);
    return new Status("ok");
  }


}
