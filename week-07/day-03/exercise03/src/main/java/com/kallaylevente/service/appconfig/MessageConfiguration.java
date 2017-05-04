package com.kallaylevente.service.appconfig;

    import com.kallaylevente.service.MessageProceeder;
    import org.springframework.context.annotation.Bean;
    import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

  @Bean
  public MessageProceeder messageProceeder() {
    return new MessageProceeder();
  }

}
