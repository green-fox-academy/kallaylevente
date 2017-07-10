import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;


public class OnlyFirstArrayNumbersTest {

  List<Integer> listA;
  List<Integer> listB;

  @Before
  public void runBeforeEachTest() {
    listA = new ArrayList<>();
    listA.add(1);
    listA.add(2);
    listA.add(3);
    listA.add(4);

    listB = new ArrayList<>();
    listB.add(3);
    listB.add(4);
    listB.add(5);
    listB.add(6);
  }

  @Test
  public void testListFiller() throws Exception {
    assertEquals(new Integer(1), OnlyFirstArrayNumbers.returnFirstListsIntegerOnly(listA, listB).get(0));
  }

}