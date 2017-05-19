package com.greenfox.controller;

import com.greenfox.model.ChatMessage;
import com.greenfox.model.ChatUser;
import com.greenfox.model.LogMessage;
import com.greenfox.model.RandomIdGenerator;
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
  RandomIdGenerator randomNumberGenerator;

  @Autowired
  UserRepository userRepository;

  @Autowired
  MessageRepository messageRepository;


  @RequestMapping("/route")
  public String index(Model model, HttpServletRequest request) {
  if (userRepository.count() == 0) {
    LogMessage log = new LogMessage(request.getRequestURI(),request.getMethod(),"INFO");
    log.printOut();
    return "redirect:register";
  }
  model.addAttribute("msg",messageRepository.findAllByOrderByTimestamp() );
  model.addAttribute("user", userRepository.findAll());
    LogMessage log = new LogMessage(request.getRequestURI(),request.getMethod(),"INFO");
    log.printOut();

    return "index";
  }

  @RequestMapping("/register")
  public String register(HttpServletRequest request) {
    LogMessage log = new LogMessage(request.getRequestURI(),request.getMethod(),"INFO");
    log.printOut();
    messageRepository.save(new ChatMessage("App"," Hi there! Submit your message using the send button!",0L));
    return "register";
  }

  @RequestMapping("/adduser")
  public String addUser(Model model, @RequestParam(value = "newuser", required = false) String user, HttpServletRequest request) {
    LogMessage log = new LogMessage(request.getRequestURI(),request.getMethod(),"INFO",request.getParameter("user"));
    log.printOut();
    userRepository.save(new ChatUser(user));

    return "redirect:/route";
  }

  @RequestMapping("/updateuser")
    public String updateUser(Model model, @RequestParam(value = "user", required = false) String user) {
      if (user.equals("")) {
        String errormsg = "The username field is empty";
        model.addAttribute("error", errormsg);
        model.addAttribute("msg",messageRepository.findAllByOrderByTimestamp() );
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
    messageRepository.save(new ChatMessage(userRepository.findOne(userCounter).getChatUserName(),msg,
        randomNumberGenerator.generateRandomIdNumber(messageRepository)));
    return "redirect:/route";
  }

}
