public class Tree extends Plants{
  public Tree(double waterlevel,String color) {
    super(waterlevel,color);
    waterLimit = 10;
  }

  @Override
  public void watering(double wateramount) {
    this.waterlevel = this.waterlevel + (wateramount * 0.40);
  }

  public void info() {
    if (isNeed()) {
      System.out.println("The " + color + " Tree need water");
    } else {
      System.out.println("The " + color + " Tree dont need water");
    }
  }
}