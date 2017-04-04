public class Tree extends Plants{
  public Tree(double waterlevel,String color) {
    super(waterlevel,color);
    setWaterLimit(10);
  }

  @Override
  public void watering(double wateramount) {
    this.setWaterlevel(this.getWaterlevel() + (wateramount * 0.40));
  }

  public void info() {
    if (isNeed()) {
      System.out.println("The " + getColor() + " Tree need water");
    } else {
      System.out.println("The " + getColor() + " Tree dont need water");
    }
  }
}