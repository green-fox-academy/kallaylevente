import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SharpieTest {
  static Sharpie sharpie;

  @BeforeClass
  public static void doItBeforeAllTest() {
    sharpie = new Sharpie("black", 100f);
  }

  @Test
  public void testUse() throws Exception {
    assertEquals(100.f,sharpie.getInkAmount(),0.0002);
  }
}