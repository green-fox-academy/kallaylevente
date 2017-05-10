package com.greenfox.dountil;

/**
 * Created by Levente on 2017. 05. 10..
 */
public class DoUntil {

  private int result;

  public DoUntil() {

  }

  public void sum(int input) {
    for (int i = 0; i < input ; i++) {
      result = result + (input - i);
    }
    this.result = result;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public void factor(int until) {
    result = 1;
    for (int i = 1; i < until + 1 ; i++) {
      result = result * i;
    }
    this.result = result;
  }
}
