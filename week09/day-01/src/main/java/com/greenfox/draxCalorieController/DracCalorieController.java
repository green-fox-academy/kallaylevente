package com.greenfox.draxCalorieController;

import com.greenfox.draxCalorieTable.DraxCalorieTable;
import com.greenfox.draxCalorieTable.Food;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DracCalorieController {

  @Autowired
  DraxCalorieTable draxCalorieTable;

  @RequestMapping(value = "/drax", method = RequestMethod.GET)
  public List<Food> getElementOfList() {
    return draxCalorieTable.getFoodList();
  }

  @RequestMapping(value = "/drax/add", method = RequestMethod.GET)
  public Object addFoodToList(@RequestParam("name") String name,
      @RequestParam("amount") int amount,
      @RequestParam("calorie") int calorie) {
    draxCalorieTable.getFoodList().add(new Food("orange",5,150));
    return draxCalorieTable.getFoodList();
  }

}
