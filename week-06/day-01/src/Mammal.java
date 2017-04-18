public class Mammal extends Animal implements spineAnimal {

  public Mammal(String name, int age, String gender, String color, int weight) {
    super(name, age, gender, color, weight);
  }

  public void greet() {
    System.out.println("grrrr");
  }

  public String wantChild() {
    return  "want child from uterus." ;
  }
}
