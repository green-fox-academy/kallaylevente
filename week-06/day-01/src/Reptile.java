public class Reptile extends Animal  implements spineAnimal{



  public void greet() {
    System.out.println("ssssssss");
  }

  public Reptile(String name, int age, String gender, String color, int weight) {
    super(name, age, gender, color, weight);
  }

  public String wantChild() {
    return  "want child from egg." ;
  }
}
