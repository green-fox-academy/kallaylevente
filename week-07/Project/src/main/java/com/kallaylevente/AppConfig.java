package com.kallaylevente;

import com.kallaylevente.Fox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Levente on 2017. 05. 04..
 */
@Configuration
public class AppConfig {

  @Bean
  public Fox getFox() {
    return new Fox();
  }

}
