import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class CountLettersTest {
  static CountLetters countLetters;

  @BeforeClass
  public static void doItBeforeAllTest() {
    countLetters = new CountLetters();
  }

  @Test
  public void testcountLetters() throws Exception{
    assertEquals(2,(int)countLetters.countLetters("alma").get("a"));
  }

}