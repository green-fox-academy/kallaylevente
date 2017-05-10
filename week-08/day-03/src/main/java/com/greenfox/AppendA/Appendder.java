package com.greenfox.AppendA;

/**
 * Created by Levente on 2017. 05. 10..
 */
public class Appendder {

  private String appended;

  public Appendder(String input) {
    this.appended = input + "a";
  }

  public String getAppended() {
    return appended;
  }
}
