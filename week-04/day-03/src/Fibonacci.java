public class Fibonacci {
  public Fibonacci() {
  }

  public int countFibonacci(int n) {
    int  value = 0;
    if (n == 0) {
      return 0;
    } else if (n == 1) {

      return 1;
    }else {
      value =countFibonacci(n - 1) + countFibonacci(n - 2);
      return value;
    }

  }
}
