import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CounterTest {
  static ArrayList<Integer> aList;
  static Counter counter;

  @Before
  public void doItBeforeEachTest() throws Exception {
    counter = new Counter();

  }

  @Test
  public void testSumWithNull() {
    aList = null;
    assertEquals(0,counter.sum(aList));
  }

  @Test
  public void testSum() throws Exception {
    aList = new ArrayList<Integer>();
    aList.add(5);
    aList.add(4);
    aList.add(3);
    aList.add(2);
    assertEquals(14, counter.sum(aList));
  }

  @Test
  public void testSumWithEmpty() throws Exception {
    aList = new ArrayList<Integer>();
    assertEquals(0, counter.sum(aList));
  }

  @Test
  public void testSumWithOne() throws Exception {
    aList = new ArrayList<Integer>();
    aList.add(5);
    assertEquals(5, counter.sum(aList));
  }

  @Test
  public void testSumMultipy() throws Exception {
    aList = new ArrayList<Integer>();
    aList.add(5);
    aList.add(4);
    assertEquals(9, counter.sum(aList));
  }

}