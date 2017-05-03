package com.greenfoxacademy.springstart.controller;
import static java.awt.Color.red;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Levente on 2017. 05. 02..
 */
@Controller
public class HelloWebController {
  List<welcomeClass> welcomeList = new ArrayList<>();
  AtomicLong counter = new AtomicLong();
  String randomColor;
  String randomSize;
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  @RequestMapping("/web/greeting")
  public List greeting(Model model, @RequestParam(value = "name" ) String name) {
    for (int i = 0; i < hellos.length ; i++) {
      randomColor = generateRandomColor();
      randomSize = generateRandomSize();
      welcomeList.add(new welcomeClass(hellos[i],randomColor,randomSize));
    }
    model.addAttribute("welcomeList", welcomeList);
/*    model.addAttribute("greetWord", hellos[(int)counter.getAndAdd(1)] );
    model.addAttribute("name", name);
    model.addAttribute("color", randomColor + randomSize);
    model.addAttribute("counter", counter.get());*/
    return welcomeList;
  }

  public String generateRandomColor() {
    int R = (int) (Math.random() * 256);
    int G = (int) (Math.random() * 256);
    int B = (int) (Math.random() * 256);
    return ("color:rgb(" + R + "," + G + "," + B + ")");
  }

  public String generateRandomSize() {
    int R = (int) (Math.random() * 60);
    return ";font-size: " + R + "px";
  }

}
//color:rgb(0,255,0)