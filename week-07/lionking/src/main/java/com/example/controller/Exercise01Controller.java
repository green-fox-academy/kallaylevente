package com.example.controller;

import com.example.modell.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Exercise01Controller {

  @RequestMapping("/exercise01")
    public String addBankAccount(Model model) {
      BankAccount bankAcc = new BankAccount("Simba", "2000", "lion");
      model.addAttribute("BankAccount", bankAcc);
      return "index";
  }

  @RequestMapping("/exercise04")
  public String textUtext(Model model) {
    model.addAttribute("text", "\"This is an <em>HTML</em> text. <b>Enjoy yourself!</b>\"");
    return "index2";
  }

}
