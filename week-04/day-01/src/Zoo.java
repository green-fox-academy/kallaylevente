public class Zoo {
  public static void main(String[] args) {
    Animal dog = new Animal();
    int[] afterplay = new int[2];
    afterplay = dog.play();
    System.out.println("after play, thirst goes to : " + afterplay[1]);
    System.out.println("after play, hunger goes to : " + afterplay[0]);

    System.out.printf("after drink, thirst is : " + Integer.toString(dog.drink()));
  }
}
