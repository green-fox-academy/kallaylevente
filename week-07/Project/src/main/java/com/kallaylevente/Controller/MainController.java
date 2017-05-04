package com.kallaylevente.Controller;

import com.kallaylevente.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Levente on 2017. 05. 04..
 */
@Controller
public class MainController {

  @Autowired
  Fox fox;

  @RequestMapping("/")
  public String index(Model model){
    model.addAttribute("Fox", fox);
    return "index";
  }

}
