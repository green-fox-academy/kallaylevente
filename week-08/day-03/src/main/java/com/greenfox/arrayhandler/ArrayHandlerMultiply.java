package com.greenfox.arrayhandler;

/**
 * Created by Levente on 2017. 05. 10..
 */
public class ArrayHandlerMultiply {

  private int result;

  public ArrayHandlerMultiply(int result) {
    this.result = result;
  }

  public ArrayHandlerMultiply() {
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public void multiply(int[] numbers) {
    int temp = 1;
    for (int i = 0; i < numbers.length ; i++) {
      temp = temp * numbers[i];
    }
    this.result = temp;
  }
}
