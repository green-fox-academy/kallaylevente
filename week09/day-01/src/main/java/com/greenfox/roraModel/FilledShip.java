package com.greenfox.roraModel;


public class FilledShip {

  private String received;
  private int amount;
  private String shipStatus;
  private boolean ready;

  public FilledShip() {
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
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

  public void fill(String caliber, int amount) {
    double temp = 0;
    this.received = caliber;
    this.amount = this.amount + amount;
    if (this.amount > 12500) {
      this.shipStatus = "overloaded";
      this.amount = 12500;
    } else if (this.amount < 12500) {
      this.ready = false;
      temp = (((double) this.amount / 12500) * 100);
      this.shipStatus = ((int )temp  + "%");
    } else if (this.amount == 12500) {
      this.shipStatus = "full";

    } else {
      this.ready = true;
      this.shipStatus = ("100%");
    }
  }
}
