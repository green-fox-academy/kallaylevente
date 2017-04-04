public class Flower extends Plants {
  public Flower(double waterlevel,String color) {
    super(waterlevel,color);
    waterLimit = 5;
  }

  @Override
  public void watering(double wateramount) {
    this.waterlevel = this.waterlevel + (wateramount * 0.75);
  }
}
