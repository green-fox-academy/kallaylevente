public class Tree extends Plants{
  public Tree(double waterlevel,String color) {
    super(waterlevel,color);
    waterLimit = 10;
  }

  @Override
  public void watering(int wateramount) {
    this.waterlevel = this.waterlevel + (wateramount * 0.40);
  }
}