package com.greenfoxacademy.springstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam(value = "name" ) String name) {
    String greet = "Hello ;" + name;
    return new Greeting(1, name);
  }

}
