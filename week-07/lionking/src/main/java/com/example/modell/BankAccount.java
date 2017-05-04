package com.example.modell;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Levente on 2017. 05. 03..
 */

@Getter
@AllArgsConstructor
public class BankAccount {
  private String name;
  private float balance;
  private String animalType;
  private boolean isGoodGuy;

}
