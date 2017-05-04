package com.example.controller;

import com.example.modell.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Exercise05Controller {

  List<BankAccount> bankAccountList;
  @RequestMapping("/exercise05")
  public String listOfAccounts(Model model) {
    bankAccountList = new ArrayList<>();
    fillBankAccountList(bankAccountList);
    model.addAttribute("accountList", bankAccountList);
    return "index5";

  }

  public void fillBankAccountList(List<BankAccount> accountList) {
    accountList.add(new BankAccount("Pumba", 1000, "warthog",true));
    accountList.add(new BankAccount("Timon", 500, "meerkat",true));
    accountList.add(new BankAccount("Fred", 2500, "antilop",true));
    accountList.add(new BankAccount("Sterve", 750, "coyote",false));
    accountList.add(new BankAccount("Simba", 2000, "lion",true));
  }

}
