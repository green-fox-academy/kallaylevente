package com.greenfox.arrayhandler;

/**
 * Created by Levente on 2017. 05. 10..
 */
public class ArrayHandlerDouble {

  private int[] result = new int[4];

  public ArrayHandlerDouble() {
  }

  public ArrayHandlerDouble(int[] result) {
    this.result = result;
  }

  public int[] getResult() {
    return result;
  }

  public void setResult(int[] result) {
    this.result = result;
  }

  public void doubler(int[] input) {

    for (int i = 0; i < input.length; i++) {
      this.result[i] = input[i] * 2 ;
    }
  }
}
