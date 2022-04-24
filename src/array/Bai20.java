package array;
import java.util.Scanner;
public class Bai20 {

    public static void main(String[] args) {
        int rowA = inputNumber("Nhập số hàng của ma trận A: ");
        int columnA = inputNumber("Nhập số cột của ma trận A: ");
        System.out.println("Nhập giá trị cho ma trận A: ");
        int[][] inputMatrixA = inputMatrix(rowA, columnA);
        int columnB = inputNumber("Nhập số cột của ma trận B: ");
        System.out.println("Nhập giá trị cho ma trận B: ");
        int[][] inputMatrixB = inputMatrix(columnA, columnB);
        int[][] inputMatrixC = maTranTich(inputMatrixA, inputMatrixB);
        System.out.println("Ma tran A: ");
        inMang(inputMatrixA);
        System.out.println("Ma tran B: ");
        inMang(inputMatrixB);
        System.out.println("Ma tran tich C: ");
        inMang(inputMatrixC);
        System.out.println("----------------------------------");

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
    static int [][] maTranTich(int[][] maTrixA, int[][] maTrixB) {
        int m = maTrixA.length, n = maTrixB[0].length, n1 = maTrixB.length;
        int[][] maTranTich = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maTranTich[i][j] = 0;
                for (int t = 0; t < n1; t++) {
                    maTranTich[i][j] = maTranTich[i][j] + maTrixA[i][t] * maTrixB[t][j];
                }
            }
        }
        return maTranTich;
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