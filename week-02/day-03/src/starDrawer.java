import java.util.Scanner;

/**
 * Created by Levente on 2017. 03. 22..
 */
public class starDrawer {
    public static void main(String[] args) {
        System.out.println("I read a number and draw a nice triangle");
        System.out.println("Please give me the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i < (number + 1); i++) {
            for (int j = 1; j < (i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
