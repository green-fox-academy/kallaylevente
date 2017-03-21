import java.util.Scanner;

/**
 * Created by Levente on 2017. 03. 21..
 */
public class OddOrEven {
    public static void main(String[] args) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in a number");
        number = scanner.nextInt();
        if ((number % 2) == 0) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is odd");
        }
    }
}
