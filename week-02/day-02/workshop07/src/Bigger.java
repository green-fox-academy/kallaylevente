import java.util.Scanner;

/**
 * Created by Levente on 2017. 03. 21..
 */
public class Bigger {
    public static void main(String[] args) {
        System.out.println("Give two number i say whitch one is the bigger");
        System.out.println("Give me the number a");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Give me the number b");
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner2.nextInt();
        if (a > b) {
            System.out.println("a is bigger than b");
        }
        else {
            System.out.println("b is bigger than a");
        }

    }
}
