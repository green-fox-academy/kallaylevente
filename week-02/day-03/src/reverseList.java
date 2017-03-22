/**
 * Created by Levente on 2017. 03. 22..
 */
public class reverseList {
    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};
        int temp = 0;
        temp = aj[0];
        for (int i = 0; i < aj.length; i++) {
            if ( i == ((aj.length-1) - i)) {
                break;
            }
            temp = aj[i];
            aj[i] = aj[(aj.length-1) - i];
            aj[(aj.length-1) - i] = temp;

        }
        for (int i = 0; i < aj.length ; i++) {
            System.out.println(aj[i]);
        }
    }
}
