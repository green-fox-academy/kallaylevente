package com.kallaylevente.Controller;

import com.kallaylevente.Fox;
import com.kallaylevente.ListOfThings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Levente on 2017. 05. 04..
 */
@Controller
public class MainController {

  @Autowired
  Fox fox;

  @Autowired
  ListOfThings listOfThings;

  @RequestMapping("/")
  public String index(Model model) {
    model.addAttribute("Fox", fox);
    return "index";
  }

  @RequestMapping("/information")
  public String information(Model model) {
    listOfThings.latestFiveActions();
    model.addAttribute("list", listOfThings);
    model.addAttribute("Fox", fox);
    return "information";
  }

  @RequestMapping("/nutritionStore")
  public String nutrition(Model model) {
    model.addAttribute("list", listOfThings);
    return "nutritionStore";
  }

  @RequestMapping("/changeNutrition")
  public String addFood(Model model, @RequestParam("another_food") String foodParam,
      @RequestParam("another_drink") String drinkParam) {
    fox.setFood(foodParam);
    fox.setDrink(drinkParam);
    listOfThings.addToHistoryList("Food is changed to: " + foodParam);
    listOfThings.addToHistoryList("Drink is changed to: " + drinkParam);
    return "redirect:/information";
  }

  @RequestMapping("/trickcenter")
  public String TrickCenter(Model model) {
    model.addAttribute("list", listOfThings);
    model.addAttribute("Fox", fox);
    return "trickcenter";
  }

  @RequestMapping("/addTrick")
  public String addTrick(Model model, @RequestParam("newTrick") String param) {
    listOfThings.addTrickToList(param);
    listOfThings.addToHistoryList("New trick added: " + param);
    return "redirect:/trickcenter";
  }

  @RequestMapping("/learnTrick")
  public String learnNewTrick(Model model, @RequestParam("another_trick") String param) {
    fox.addTrick(param);
    for (int i = 0; i < listOfThings.getTrickList().size(); i++) {
      if (param.equals(listOfThings.getTrickList().get(i))) {
        listOfThings.getTrickList().remove(i);
      }
    }
    listOfThings.addToHistoryList("New trick learned: " + param);
    return "redirect:/trickcenter";
  }

  @RequestMapping("/addFood")
  public String addFood(Model model, @RequestParam("newFood") String param) {
    listOfThings.addFoodToList(param);
    listOfThings.addToHistoryList("New food added: " +  param);
    return "redirect:/nutritionStore";
  }

  @RequestMapping("/addDrink")
  public String addDrink(Model model, @RequestParam("newDrink") String param) {
    listOfThings.addDrinkToList(param);
    listOfThings.addToHistoryList("New drink added" + param);
    return "redirect:/nutritionStore";
  }

  @RequestMapping("/history")
  public String actionHistory(Model model) {
    model.addAttribute("list", listOfThings);
    return "history";
  }

}
