/**
 * Created by Levente on 2017. 03. 22..
 */
public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(factorio(number));
    }
    public static int factorio(int number) {
        int factorial = 1;
        for (int i = 1; i < number+1 ; i++) {
            factorial = i * factorial;
        }
        return  factorial;
    }
}
