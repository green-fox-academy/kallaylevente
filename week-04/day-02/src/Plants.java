public class Plants {
  private double waterlevel;
  private String color;
  private double waterLimit;

  public Plants(double waterlevel,String color) {
    this.waterlevel = waterlevel;
    this.color = color;
    this.waterLimit = 0;
  }

  public Plants() {
  }

  public boolean isNeed() {
    return (this.waterlevel < this.waterLimit);
  }

  public void info() {
    if (isNeed()) {
      System.out.println("need water");
    } else {
      System.out.println("dont need water");
    }
  }

  public void watering(double wateramount) {
    this.waterlevel = this.waterlevel + wateramount;
  }

  public double getWaterlevel() {
    return waterlevel;
  }

  public void setWaterlevel(double waterlevel) {
    this.waterlevel = waterlevel;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getWaterLimit() {
    return waterLimit;
  }

  public void setWaterLimit(double waterLimit) {
    this.waterLimit = waterLimit;
  }
}
