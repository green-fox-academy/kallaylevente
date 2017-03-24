import java.util.ArrayList;
import java.util.Scanner;

public class PalindromSearcher {
    public static void main(String[] args) {
        System.out.println("This program, will search for palindromes in the given text.");
        String text = scanner();
        ArrayList<String> alist = new ArrayList<>();
        extract(text);
        alist = extract(text);
        String listItem = new String();
        for (int i = 0; i < alist.size() ; i++) {
            listItem = alist.get(i).toString();
            if (isPalindrom(listItem)) {
                System.out.print("\"" + listItem + "\"" + ",");
            }
        }
    }

    public static boolean isPalindrom(String listItem) {
        char begin  = 'c';
        char  end = 'c';
        for (int i = 0; i < listItem.length() ; i++) {
            begin = listItem.charAt(i);
            end = listItem.charAt((listItem.length() - 1) - i);
            if ((begin != end) && (i < ((listItem.length() - 1) - i))) {
                return false;
            }

        }
        return true;
    }

    public static String scanner() {
        System.out.println("Please give me a text!");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
    public static ArrayList extract(String text){
        ArrayList<String> alist = new ArrayList<>();
        char begin  = 'c';
        char  end = 'c';
        String sub = new String();
        for (int i = 0; i < text.length() ; i++) {
            begin = text.charAt(i);
            for (int j = i+1; j < text.length(); j++) {
                end = text.charAt(j);
                if (begin == end) {
                    sub = text.substring(i,j+1);
                    alist.add(sub);
                }

            }
        }
        return alist;
    }
}
