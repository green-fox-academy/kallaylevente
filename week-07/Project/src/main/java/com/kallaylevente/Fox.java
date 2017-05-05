package com.kallaylevente;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


public class Fox {
  private String name;
  private List<String> trickList;
  private String food;
  private String drink;



  public Fox() {
    this.name = "Levi";
    this.food = "Hamburger";
    this.drink = "Beer";

    trickList = new ArrayList<>();
    fillList();
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public String getName() {
    return name;
  }

  public List<String> getTrickList() {
    return trickList;
  }

  public void fillList() {
    /*trickList.add("Play Hearthstone");
    trickList.add("Kettlebell");*/
  }

  public void setFood(String food) {
    this.food = food;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public void addTrick(String trick) {
    trickList.add(trick);
  }

}
