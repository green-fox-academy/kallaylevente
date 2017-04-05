import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class AnagrammDeciderTest {
  static AnagrammDecider anagrammDecider;

  @BeforeClass
  public static void doItBeforeAllTest() {
    anagrammDecider = new AnagrammDecider();
  }

  @Test
  public void testIfEqual () throws Exception {
    assertTrue(anagrammDecider.ifEqual("abcd", "acdb"));
  }

}