import java.util.Arrays;
import java.util.List;

public class SortTheArray {
  public static void main(String[] args) {
    Integer[] intArray = { 1, 2, 3, 4, 5 };
    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };

    listSorter(intArray);
    listSorter(doubleArray);

  }

  public static <T extends Number> void listSorter(T[] inputList) {
    double[] answerArray = new double[inputList.length];
    Arrays.sort(inputList);


    for (int i = 0; i < inputList.length; i++) {
      answerArray[i] = inputList[(inputList.length - 1 - i)].doubleValue();
      System.out.println(answerArray[i]);
    }

  }
}
