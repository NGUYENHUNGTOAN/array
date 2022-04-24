package array;
import java.util.Scanner;
public class Bai22 {

    public static void main(String[] args) {
        int m = inputNumber("Nhập số hàng của ma trận: ");
        int n = inputNumber("Nhập số cột của ma trận: ");
        System.out.println("Nhập giá trị cho ma trận: ");
        int[][] inputMatrix = inputMatrix(m, n);
        inMang(inputMatrix);
        System.out.println("----------------------------------");
        inMang(sapXep(inputMatrix, m, n));
    }

    static int inputNumber(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextInt();
    }

    static int[][] inputMatrix(int row, int column) {
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Nhập phần tử ở vị trí thứ [ " + i + " , " + j + " ]: ");
                matrix[i][j] = new Scanner(System.in).nextInt();
            }
        }
        return matrix;
    }

    static int[][] sapXep(int[][] maTrix, int m, int n) {
        for (int k = 0; k < m; k++) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = n - 1; j > i; j--) {
                    if (maTrix[k][j] < maTrix[k][j - 1]) {
                        int temp = maTrix[k][j];
                        maTrix[k][j] = maTrix[k][j - 1];
                        maTrix[k][j - 1] = temp;
                    }
                }
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