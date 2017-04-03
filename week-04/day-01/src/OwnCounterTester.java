
public class OwnCounterTester {
  public static void main(String[] args) {
    Counter ten = new Counter(10);
    ten.add();
    System.out.println(ten.get());

    System.out.println(ten.reset());
    System.out.println(ten.add(10));


  }
}
