public class Bird extends Animal implements spineAnimal{

  public void greet() {
    System.out.println("chip chip chip");
  }

  public Bird(String name, int age, String gender, String color, int weight) {
    super(name, age, gender, color, weight);
  }

  public String wantChild() {
    return  "want child from egg." ;
  }
}
