/**
 * Created by Levente on 2017. 03. 23..
 */
public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        quote = quote.replace("It you", "It always takes longer than you");
        System.out.println(quote);
    }
}
