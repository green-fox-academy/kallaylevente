package com.greenfox.Greeter;

/**
 * Created by Levente on 2017. 05. 10..
 */
public class Greeet {

  private String welcome_message;


  public Greeet(String name, String title) {

    this.welcome_message = ("Oh, hi there " + name + ", my dear " + title + "!");
  }

  public String getWelcome_message() {
    return welcome_message;
  }


}
