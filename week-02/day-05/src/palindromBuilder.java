import java.util.Scanner;

public class palindromBuilder {
    public static void main(String[] args) {
        System.out.println("If you give me a text, i will show you a palindrome.");
        String input = new String();
        input = scanner();
        System.out.println("The palindrom for this input is: " + reverser(input));
    }

    public static String scanner() {
        System.out.println("Please give me a text!");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public static String reverser(String reversed) {
        int size = reversed.length();
        char c = 'c';
        String result = new String();
        for (int i = size - 1; i >= 0; i--) {
            c = reversed.charAt(i);
            String charToString = Character.toString(c);
            result = result.concat(charToString);
        }
        result = reversed.concat(result);
        return result;
    }
}
