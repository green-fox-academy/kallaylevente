/**
 * Created by Levente on 2017. 03. 22..
 */
public class Summoner {
    public static void main(String[] args) {
        int until = 5;
        System.out.println(summoner(until));
    }

    public static int summoner(int until) {
        int sum = 0;
        for (int i = 1; i < until + 1; i++) {
            sum = sum + i;

        }
        return sum;
    }
}
