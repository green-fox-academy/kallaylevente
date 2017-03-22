/**
 * Created by Levente on 2017. 03. 22..
 */
public class sumAllElements {
    public static void main(String[] args) {
        int[] ai = {3, 4, 5, 6, 7};
        int sum = 0;
        for (int i = 0; i < ai.length ; i++) {
            sum = sum + ai[i];
        }
        System.out.println(sum);
    }
}
