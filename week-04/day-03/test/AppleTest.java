import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Levente on 2017. 04. 05..
 */
public class AppleTest {

  Apple apple = new Apple("red");

  @Test
  public void getApple() throws Exception {
    assertEquals("apple", apple.getApple());
  }


  @Test
  public void testAppleConstructor() {
    assertEquals("red", "red");
  }

}