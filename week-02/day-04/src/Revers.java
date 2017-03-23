/**
 * Created by Levente on 2017. 03. 23..
 */
public class Revers {
    public static void main(String[] args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        reversed = reverser(reversed);
        System.out.println(reversed);
    }

    public static String reverser(String reversed){
        int size = reversed.length();
        char c = 'c';
        String result = new String();
        for (int i = size-1; i > 0 ; i--) {
            c = reversed.charAt(i);
            String charToString = Character.toString(c);
            result = result.concat(charToString);

        }
        return  result;
    }
}
