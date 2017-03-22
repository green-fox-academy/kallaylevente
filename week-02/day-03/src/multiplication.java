import java.util.Scanner;

/**
 * Created by Levente on 2017. 03. 22..
 */
public class multiplication {
    public static void main(String[] args) {
        System.out.println("Please give me a number and I will show the multiplication table ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i < 11 ; i++) {
            System.out.println(i + " * " + number + " = " + (i * number) );
        }
    }
}
