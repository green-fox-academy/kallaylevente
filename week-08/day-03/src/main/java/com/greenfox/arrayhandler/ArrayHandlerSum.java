package com.greenfox.arrayhandler;

/**
 * Created by Levente on 2017. 05. 10..
 */
public class ArrayHandlerSum {

  private int result;

  public ArrayHandlerSum() {
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public void sum(int[] input) {

    for (int i = 0; i < input.length; i++) {
      result = result + input[i];
    }
    this.result = result;
  }

  public ArrayHandlerSum(int result) {
    this.result = result;
  }
}
