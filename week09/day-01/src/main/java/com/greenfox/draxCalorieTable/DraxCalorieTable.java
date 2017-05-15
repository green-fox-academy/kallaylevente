package com.greenfox.draxCalorieTable;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class DraxCalorieTable {

  private List<Food> foodList = new ArrayList<>();

  public DraxCalorieTable() {
    this.foodList.add(new Food("apple",50,120));
    this.foodList.add(new Food("pearl",25,150));
    this.foodList.add(new Food("melone",75,180));
  }

  public List<Food> getFoodList() {
    return foodList;
  }

  public void setFoodList(List<Food> foodList) {
    this.foodList = foodList;
  }
}
