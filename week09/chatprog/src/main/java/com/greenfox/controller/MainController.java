package com.greenfox.controller;

import com.greenfox.model.ChatMessage;
import com.greenfox.model.ChatUser;
import com.greenfox.model.LogMessage;
import com.greenfox.repository.MessageRepository;
import com.greenfox.repository.UserRepository;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private int userCounter = 1;

  @Autowired
  UserRepository userRepository;

  @Autowired
  MessageRepository messageRepository;


  @RequestMapping("/route")
  public String index(Model model) {
  if (userRepository.count() == 0) {
    return "redirect:register";
  }
  model.addAttribute("msg",messageRepository.findAll() );
  model.addAttribute("user", userRepository.findAll());

    return "index";
  }

  @RequestMapping("/register")
  public String register() {
    messageRepository.save(new ChatMessage("App"," Hi there! Submit your message using the send button!",0L));
    return "register";
  }

  @RequestMapping("/adduser")
  public String addUser(Model model, @RequestParam(value = "newuser", required = false) String user) {
    userRepository.save(new ChatUser(user));

    return "redirect:/route";
  }

  @RequestMapping("/updateuser")
    public String updateUser(Model model, @RequestParam(value = "user", required = false) String user) {
      if (user.equals("")) {
        String errormsg = "The username field is empty";
        model.addAttribute("error", errormsg);
        model.addAttribute("msg",messageRepository.findAll() );
        model.addAttribute("user", userRepository.findAll());
        return "index";
      }
      userRepository.deleteAll();
      userRepository.save(new ChatUser(user));
      userCounter++;
      return "redirect:/route";
  }

  @RequestMapping("/addmessage")
  public String addNewMessage(@RequestParam(value = "newMessage")String msg) {
    Long temp = 0L;
    do {
      temp = (long)(1000000 + (Math.random() * 1000000));
    } while (messageRepository.exists(temp));
    messageRepository.save(new ChatMessage(userRepository.findOne(userCounter).getChatUserName(),msg,temp));
    return "redirect:/route";
  }

}
