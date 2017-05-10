package com.greenfox.arrayhandler;

/**
 * Created by Levente on 2017. 05. 10..
 */
public class InputArray {

  private String what ;
  private int[] numbers;

  public InputArray() {
  }

  public InputArray(String what, int[] numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }
}
