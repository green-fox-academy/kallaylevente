public class Flower extends Plants {
  public Flower(double waterlevel,String color) {
    super(waterlevel,color);
    waterLimit = 5;
  }

  @Override
  public void watering(double wateramount) {
    this.waterlevel = this.waterlevel + (wateramount * 0.75);
  }

  @Override
  public void info() {
    if (isNeed()) {
      System.out.println("The " + color + " Flower needs water");
    } else {
      System.out.println("The " + color + " Flower dont need water");
    }
  }
}
