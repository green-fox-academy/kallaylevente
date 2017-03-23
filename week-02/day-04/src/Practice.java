import java.util.Scanner;

/**
 * Created by Levente on 2017. 03. 23..
 */
public class Practice {
    public static void main(String[] args) {
        int number = scanner();
        System.out.println(number);
    }

    public static int scanner() {
        System.out.println("Please give me a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }
}
