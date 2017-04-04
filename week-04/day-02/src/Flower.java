public class Flower extends Plants {
  public Flower(double waterlevel,String color) {
    super(waterlevel,color);
    setWaterLimit(5);
  }

  @Override
  public void watering(double wateramount) {
    this.setWaterlevel(getWaterlevel()+ (wateramount * 0.75));
  }

  @Override
  public void info() {
    if (isNeed()) {
      System.out.println("The " + getColor() + " Flower needs water");
    } else {
      System.out.println("The " + getColor() + " Flower dont need water");
    }
  }
}
