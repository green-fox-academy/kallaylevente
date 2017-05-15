package com.greenfox.Greeter;

import com.greenfox.Greeter.Errormessage;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Levente on 2017. 05. 10..
 */
@RestController
public class GreeterRestController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public Errormessage someException(MissingServletRequestParameterException e) {
    String name = e.getParameterName();
    return new Errormessage("Please provide a " + name + "!");
  }

  @RequestMapping("/greeter")
  public Greeet greeting(@RequestParam("name") String name,
      @RequestParam("title") String title) {
    return new Greeet(name, title);
  }



}
