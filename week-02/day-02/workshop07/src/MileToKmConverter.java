import java.util.Scanner;

/**
 * Created by Levente on 2017. 03. 21..
 */
public class MileToKmConverter {
    public static void main(String[] args) {
        System.out.println("What is the distance in km? ");
        Scanner scanner = new Scanner(System.in);
        int kilometers = scanner.nextInt();
        double miles = kilometers * 0.621371192 ;
        System.out.println("Distance in miles is: " + miles);
    }
}
