package array;
import java.util.Scanner;

public class Bai23 {

    public static void main(String[] args) {
        int n = inputNumber("Nhập n: ");
        int[][] matrix = matrix(n);
        outputMatrix(matrix);
    }
    static int inputNumber(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextInt();
    }
    static int[][] matrix(int n) {
        int[][] matrix = new int[n][n];
        int index = 1, p = 0;
        int temp = n;
        while (index <= temp * temp) {
            for (int i = p; i < n; i++) {
                matrix[p][i] = index++;
            }
            for (int i = p + 1; i < n; i++) {
                matrix[i][n - 1] = index++;
            }
            for (int i = n - 2; i >= p; i--) {
                matrix[n - 1][i] = index++;
            }
            for (int i = n - 2; i > p; i--) {
                matrix[i][p] = index++;
            }
            p++;
            n--;
        }
        return matrix;
    }
    static void outputMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}