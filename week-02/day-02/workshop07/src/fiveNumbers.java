import java.util.Scanner;

/**
 * Created by Levente on 2017. 03. 21..
 */
public class fiveNumbers {
    public static void main(String[] args) {
        int sum = 0;
        double average = 0;
        for (int i = 0; i < 5 ; i++ ){
            System.out.println("Give me a number");
            Scanner scanner = new Scanner(System.in);
            sum += scanner.nextInt();

        }
        average = (sum / 5);
        System.out.println("Sum of the 5 numbers is: " + sum);
        System.out.println("Average of the 5 number is: " + average);
    }
}
