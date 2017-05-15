package com.greenfox.yondumodell;


public class Yondu {
  private String distance;
  private String time;
  private String speed;

  public Yondu() {
  }

  public String getDistance() {
    return distance;
  }

  public void setDistance(String distance) {
    this.distance = distance;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getSpeed() {
    return speed;
  }

  public void setSpeed(String speed) {
    this.speed = speed;
  }

  public String countSpeed(String distance,String time) {
    float dist = Float.parseFloat(distance);
    float tim = Float.parseFloat(time);
    float speed = dist / tim ;
    String spd = Float.toString(speed);
    return spd;
  }
}
