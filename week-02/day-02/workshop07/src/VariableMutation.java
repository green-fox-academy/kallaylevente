/**
 * Created by Levente on 2017. 03. 21..
 */
public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(a + 10);
        int b = 100;
        System.out.println(b - 7);
        int c = 44;
        System.out.println(c * 2);
        int d = 125;
        System.out.println(d / 5);
        int e = 8;
        System.out.println(e*e*e);
        int f1 = 123;
        int f2 = 345;
        boolean ifBigger = (f1 > f2);
        System.out.println(ifBigger);
        int g1 = 350;
        int g2 = 200;
        boolean ifBigger2 = ((g2 * 2) > g1);
        System.out.println("double g2 is bigger: " + ifBigger2);
        long h = 1357988018575474L;
        boolean divisor = ((h % 11) == 0);
        System.out.println("11 is a divisor: " + divisor);
        int i1 = 10;
        int i2 = 3;
        boolean between = ((i1 > (i2*i2)) && (i1 < (i2*i2*i2)));
        System.out.println("The number is between:" + between);
        int j = 1521;
        boolean ifDivided = ((0 == (j % 3)) || (0 == (j % 5)));
        System.out.println("3 OR 5 is a divider: " + ifDivided);
        String k = "Apple";
        k = (k + k + k + k);
        System.out.println(k);
    }
}
