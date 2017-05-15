package com.greenfox.roraController;


public class Ship {

  private int caliber25;
  private int caliber30;
  private int caliber50;
  private String shipStatus;
  private boolean ready;

  public Ship() {
    this.caliber25 = 0;
    this.caliber30 = 0;
    this.caliber50 = 0;
    this.ready = false;
  }

  public int getCaliber25() {
    return caliber25;
  }

  public void setCaliber25(int caliber25) {
    this.caliber25 = caliber25;
  }

  public int getCaliber30() {
    return caliber30;
  }

  public void setCaliber30(int caliber30) {
    this.caliber30 = caliber30;
  }

  public int getCaliber50() {
    return caliber50;
  }

  public void setCaliber50(int caliber50) {
    this.caliber50 = caliber50;
  }

  public String getShipStatus() {
    return shipStatus;
  }

  public void setShipStatus(String shipStatus) {
    this.shipStatus = shipStatus;
  }

  public boolean isReady() {
    return ready;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }

  public String shipStatusTracker() {
    int temp = (caliber50 + caliber30 + caliber25);
    double divide = 0;
    if (caliber50 == 0 && caliber25 == 0 && caliber30 == 0){
      return "empty";
    } else if (temp > 12500) {
      this.ready = true;
      return "100%";
    } else
      divide = (int)(temp / divide);

    return (String.valueOf(divide) + "%");


  }
}
