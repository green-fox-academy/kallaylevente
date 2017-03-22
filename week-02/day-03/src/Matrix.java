import java.util.Scanner;

/**
 * Created by Levente on 2017. 03. 22..
 */
public class Matrix {
    public static void main(String[] args) {
        System.out.println("Please give me a number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int matrix[][];
        int k = 0;
        matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                    System.out.print(matrix[i][j]);
                } else {
                    matrix[i][j] = 0;
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
        }


    }
}
