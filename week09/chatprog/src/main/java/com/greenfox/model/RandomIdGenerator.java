package com.greenfox.model;


import com.greenfox.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RandomIdGenerator {


  private Long randomID;

  public RandomIdGenerator() {

  }

  public Long getRandomID() {
    return randomID;
  }

  public void setRandomID(Long randomID) {
    this.randomID = randomID;
  }

  public Long generateRandomIdNumber(MessageRepository messageRepository) {
    Long temp = 0L;
    do {
      temp = (long) (1000000 + (Math.random() * 1000000));
    } while (messageRepository.exists(temp));
    return temp;
  }
}
