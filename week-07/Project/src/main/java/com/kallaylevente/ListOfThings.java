package com.kallaylevente;


import java.util.ArrayList;
import java.util.List;

public class ListOfThings {
  List<String> foodList;
  List<String> drinkList;
  List<String> trickList;

  public ListOfThings() {
    this.foodList = new ArrayList<>();
    this.drinkList = new ArrayList<>();
    this.trickList = new ArrayList<>();
    foodList.add("potato");
    foodList.add("carrott");
    foodList.add("tomato");
    drinkList.add("water");
    drinkList.add("sprite");
    drinkList.add("coffee");
    trickList.add("Java programming");
    trickList.add("Use spring");
    trickList.add("suck");
  }

  public void addFoodToList(String newFood) {
    foodList.add(newFood);
  }

  public void addDrinkToList(String newDrink) {
    drinkList.add(newDrink);
  }

  public void addTrickToList(String newTrick) {
    trickList.add(newTrick);
  }

  public List<String> getFoodList() {
    return foodList;
  }

  public List<String> getDrinkList() {
    return drinkList;
  }

  public List<String> getTrickList() {
    return trickList;
  }
}
