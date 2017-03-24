import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        int number = random();
        int guess = 0;
        int live = 5;
        System.out.println("I've a number between 1-100.");
        for (int i = 0; i < 5; i++) {
            guess = scanner();
            if (guess == number) {
                System.out.println("Nice, you got it!");
                break;
            }
            else if ( guess < number) {
                live = live-1;
                if (live == 0){
                    System.out.println("You lose!");
                }
                else {
                    System.out.println("Too low. You have " + live + " lives left.");
                }
            }
            else {
                live = live-1;
                if (live == 0){
                    System.out.println("You lose!");
                }
                else {
                    System.out.println("Too high. You have " + live + " lives left.");
                }
            }
        }
    }


    public static int random() {
        Random rand = new Random();
        int n = rand.nextInt(5) + 1;
        return n;
    }
    public static int scanner() {
        System.out.println("Please give me a number!");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }

}
