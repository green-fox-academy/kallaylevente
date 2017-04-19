

public class SumTheArray {
  public static void main(String[] args) {
    Integer[] intArray = { 1, 2, 3, 4, 5 };
    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };

    System.out.println(arraySummer(intArray,5));
    System.out.println(arraySummer(doubleArray,5) == 0 ? "Given number is bigger than length of the array" : arraySummer(doubleArray,5) );
  }

  public static <T extends Number>  double arraySummer( T[] inputArray, int length){
    double sum = 0;
    try {
      for (int i = 0; i < length; i++) {
        sum = sum + inputArray[i].doubleValue();
      }
    }catch (IndexOutOfBoundsException e) {
      sum = 0;

    }
    return sum;
  }
}
