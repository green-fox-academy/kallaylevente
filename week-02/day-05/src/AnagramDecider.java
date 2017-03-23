
import java.util.Arrays;
import java.util.Scanner;

public class AnagramDecider {
    public static void main(String[] args) {
        String word1 = scanner();
        String word2 = scanner();
        String sortedword1 = sort(word1);
        String sortedword2 = sort(word2);
        System.out.println(ifEqual(sortedword1,sortedword2));
    }

    public static String scanner() {
        System.out.println("Please give me a text!");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
    public static String sort(String word){
        char[] ar = word.toCharArray();
        Arrays.sort(ar);
        String sorted = String.valueOf(ar);
        return sorted;
    }
    public static String ifEqual(String word1,String word2){
        if (word1.equals(word2)){
            return "The two words are anagrams.";
        }
        else{
            return "These two words are not anagrams.";
        }
    }
}
