package com.greenfox.dountil;

/**
 * Created by Levente on 2017. 05. 10..
 */
public class ErrorMessage {

  private String error;

  public ErrorMessage() {
    this.error = "Please provide a number!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
