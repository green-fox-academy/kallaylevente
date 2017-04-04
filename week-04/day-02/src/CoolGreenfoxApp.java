
public class CoolGreenfoxApp {
  public static void main(String[] args) {
    Person myPerson = new Person();
    myPerson.introduce();

    Student myStudent = new Student();
    myStudent.introduce();
    myStudent.skipDays(5);
    myStudent.introduce();


    Mentor mYmentor = new Mentor();
    mYmentor.introduce();
    mYmentor.setLevel("Junior");
    mYmentor.introduce();

  }
}
