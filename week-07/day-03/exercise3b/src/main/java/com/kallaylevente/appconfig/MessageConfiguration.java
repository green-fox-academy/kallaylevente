package com.kallaylevente.appconfig;


import com.kallaylevente.service.EmailService;
import com.kallaylevente.service.MessageProceeder;
import com.kallaylevente.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

  @Bean
  public MessageProceeder messageProceeder() {
    return new MessageProceeder();
  }

  @Bean
  public EmailService emailService() {
    return new EmailService();
  }

  @Bean
  public TwitterService twitterService() {
    return new TwitterService();
  }

}
