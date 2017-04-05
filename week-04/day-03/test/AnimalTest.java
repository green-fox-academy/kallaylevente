import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalTest {
  static int hunger;
  static int thirst;
  static Animal animal;

  @Before
  public void doItBeforeEachTest() throws Exception {
    animal = new Animal();
  }

  @Test
  public void testEating() throws Exception {
    assertEquals(51,animal.eating());
  }

  @Test
  public void testDrinking() throws Exception {
    assertEquals(51,animal.drink());
  }

  @Test
  public void testPlaying() throws Exception {
    animal.play();
    assertEquals(51,animal.getHunger());
  }


}
