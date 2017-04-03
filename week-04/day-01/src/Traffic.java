public class Traffic {
  public static void main(String[] args) {
    Car opel = new Car();
    Station shell = new Station();

    shell.refill(opel);
    System.out.println("this is the gaststation gasamount: " + shell.gasAmount);
    System.out.println("this is the cars gasamount: " + opel.gasAmount);

  }


}
