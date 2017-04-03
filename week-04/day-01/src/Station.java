public class Station {
  int gasAmount;

  public Station() {
    gasAmount = 500;
  }

  public void refill(Car car) {
    this.gasAmount = gasAmount - car.capacity;
    car.gasAmount = car.gasAmount + car.capacity;
  }
}
