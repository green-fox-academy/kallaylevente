public class Plants {
  public double waterlevel;
  public String color;
  public double waterLimit;

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


}
