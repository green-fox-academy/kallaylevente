import main.java.music.BassGuitar;
import main.java.music.ElectricGuitar;
import main.java.music.Violin;

public class Main {
  public static void main(String[] args) {
    System.out.println("Test 1, create Electric Guitar, Bass Guitar and Violin with default strings.");
    ElectricGuitar guitar = new ElectricGuitar();
    BassGuitar bassGuitar = new BassGuitar();
    Violin violin = new Violin();

    System.out.println("Test 1 Play");
    guitar.play();
    bassGuitar.play();
    violin.play();
  }

}
