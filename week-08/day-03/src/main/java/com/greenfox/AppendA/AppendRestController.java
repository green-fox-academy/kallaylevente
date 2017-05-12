package com.greenfox.AppendA;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Levente on 2017. 05. 10..
 */
@RestController
public class AppendRestController {



  @RequestMapping("/appenda/{appendable}")
  public Appendder append(@PathVariable("appendable")  String input) {
    return new Appendder(input);
  }
}
