/**
 * Created by Levente on 2017. 03. 22..
 */
public class reverseList {
    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};
        int temp = 0;
        temp = aj[0];
        for (int i = 0; i < aj.length; i++) {
            aj[0 + i] = aj[aj.length - 2];
            if ((0 + i) == aj.length - 2) {
                break;
            }
            System.out.println(aj[i]);
        }
    }
}
