package com.greenfox.doubling;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {



  @RequestMapping("/")
  public String index() {
    return "index";
  }

  /*@RequestMapping(name = "/doubling", method = RequestMethod.GET)
  public Doubling doubling(int received) {
    doubling.doubler(received);
    return doubling;
  }*/



}
