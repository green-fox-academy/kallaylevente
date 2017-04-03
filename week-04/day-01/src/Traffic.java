public class Traffic {
  public static void main(String[] args) {
    Car opel = new Car();
    Station shell = new Station();

    shell.refill(opel);
    System.out.println(shell.gasAmount);
    System.out.println(opel.gasAmount);
  }


}
