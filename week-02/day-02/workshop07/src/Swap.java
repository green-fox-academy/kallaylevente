/**
 * Created by Levente on 2017. 03. 21..
 */
public class Swap {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;
        int tempA = a;
        a = b;
        b = tempA;
        System.out.println("Now a is: " + a);
        System.out.println("Now b is: " + b);
    }
}
