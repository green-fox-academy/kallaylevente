package com.greenfox.doubling;

import com.greenfox.doubling.Doubling;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainRestController {

  @ExceptionHandler(Exception.class)
  public ErrorMessage someException(Exception e) {
    return new ErrorMessage("Please provide an input!");
  }



  @RequestMapping("/test")
  public String restIndex() {
    return "index";
  }

  @RequestMapping("/doubling")
  public Doubling doubling(@RequestParam("input") int input) {
    return new Doubling(input);
  }

}
