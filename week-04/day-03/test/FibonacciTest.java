import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class FibonacciTest {
  static Fibonacci fibonacci;
  static int n;

  @BeforeClass
  public static void doItBeforeAllTest() {
    fibonacci = new Fibonacci();
  }

  @Test
  public void testFibonacii() throws Exception {
    assertEquals(2,fibonacci.countFibonacci(3));
  }

}