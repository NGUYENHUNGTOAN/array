package array;
import java.util.Scanner;
public class Bai24 {

    public static void main(String[] args) {
        int n = inputNumber("Nhập số N của ma trận vuông: ");
        System.out.println("Nhập giá trị cho ma trận: ");
        int[][] inputMatrix = inputMatrix(n,n);
        inMang(inputMatrix);
        System.out.println("----------------------------------");
        inMang(RotateMatrix(inputMatrix, n));
        System.out.println("----------------------------------");
        inMang(RotateMatrix1(inputMatrix, n));
    }
    static int inputNumber(String message){
        System.out.println(message);
        return new Scanner(System.in).nextInt();
    }
    static int[][] inputMatrix(int row, int column) {
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Nhập phần tử ở vị trí thứ [ "+i+" , " +j+" ]: ");
                matrix[i][j] = new Scanner(System.in).nextInt();
            }
        }
        return matrix;
    }
    // thuan chieu kim dong ho
    static int[][] RotateMatrix(int[][] matrix, int n) {
        int[][] maTrix = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                maTrix[i][j] = matrix[n - j - 1][i];
            }
        }
        return maTrix;
    }
    // Nguoc chieu kim dong ho
    static int[][] RotateMatrix1(int[][] matrix, int n) {
        int[][] maTrix = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                maTrix[n - i - 1][j] = matrix[j][i];
            }
        }
        return maTrix;
    }
    static void inMang(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}