public class Zoo {
  public static void main(String[] args) {
    Reptile reptile = new Reptile("Crocodile",5,"female","green",500);
    Mammal mammal = new Mammal("Koala",15,"male","grey", 25);
    Bird bird = new Bird("Parrot", 20,"female","rainbow", 1);

    System.out.println("Who want a baby?");
    System.out.println(reptile.getName() + ", " + reptile.wantChild());
    System.out.println(mammal.getName() + ", " + mammal.wantChild());
    System.out.println(bird.getName() + ", " + bird.wantChild());

  }
}
