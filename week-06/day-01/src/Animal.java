abstract class Animal {
  private String name;
  private int age;
  private String gender;
  private String color;
  private int  weight;

  public String getName() {
    return name;
  }

  public Animal(String name, int age, String gender, String color, int weight) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.color = color;
    this.weight = weight;
  }


}
