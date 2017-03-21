import java.util.Scanner;

/**
 * Created by Levente on 2017. 03. 21..
 */
public class AnimalsAndLegs {
    public static void main(String[] args) {
        System.out.println("How many chikens do you have?");
        Scanner scanner = new Scanner(System.in);
        int chicken =  scanner.nextInt();
        System.out.println("What is the number of your pigs");
        Scanner scanner1 = new Scanner(System.in);
        int pig = scanner1.nextInt();
        System.out.println("Number of legs: " + ((chicken * 2) + (pig * 4)));

    }
}
