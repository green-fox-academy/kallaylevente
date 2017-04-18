
public class Main {
  public static void main(String[] args) {
    CharOperations a = new CharOperations("hello");

    System.out.println(a.charAt(0));
    System.out.println(a.subSequence(0,2));
  }
}
