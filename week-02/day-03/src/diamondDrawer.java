import java.util.Scanner;

/**
 * Created by Levente on 2017. 03. 22..
 */
public class diamondDrawer {
    public static void main(String[] args) {
        System.out.println("I read a number and draw a nice pyramid");
        System.out.println("Please give me the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0 ; i < (number + 1) / 2   ; i++) {
            for (int j = 1; j < number-i  ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < (number - 1) / 2; i++) {
            for (int j = 0; j <= i+2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (((((number-2*i) - 1)/2)*2)-1) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}

