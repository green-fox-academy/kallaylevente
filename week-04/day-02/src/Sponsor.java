public class Sponsor extends Person {
  private String company;
  private int hiredStudents;

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " +  this.getGender() + "who represents " + company + " and hired " + hiredStudents + " students so far");
  }

  public void hire() {
    this.hiredStudents++;
  }

  @Override
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public Sponsor() {
    super();
    this.company = "Google";
    this.hiredStudents = 0;
  }

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.hiredStudents = 0;
  }

}
