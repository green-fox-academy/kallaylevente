import java.util.Scanner;

/**
 * Created by Levente on 2017. 03. 22..
 */
public class biggerFinder {
    public static void main(String[] args) {
        System.out.println("Please give me two numbers!");
        System.out.println("Give me the firs number: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Give me the second number: ");
        Scanner scanner2 = new Scanner(System.in);
        int secondNumber = scanner2.nextInt();
        if (secondNumber <= firstNumber) {
            System.out.println("The scond should be bigger");
        }
        else {
            for (int i = firstNumber; i < secondNumber ; i++) {
                System.out.println(i);

            }
        }

    }
}
