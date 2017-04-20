
public class Car {

  private CarType type;
  private CarColor color;


  public CarColor getColor() {
    return color;
  }

  public Car(CarType type, CarColor color) {
    this.type = type;
    this.color = color;

  }

  public CarType getType() {
    return type;
  }

  public String toString() {
    return (type + " " + color);
  }
}
