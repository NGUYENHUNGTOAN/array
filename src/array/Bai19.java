package array;
import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        int row = inputNumber("Nhập số hàng của ma trận: ");
        int column = inputNumber("Nhập số cột của ma trận: ");
        System.out.println("Nhập giá trị cho ma trận: ");
        int[][] inputMatrix = inputMatrix(row, column);
        inMang(inputMatrix);
        System.out.println("----------------------------------");
        int[][] outputmatrix = new int[column][row];
        inMang(chuyenVi(inputMatrix, outputmatrix ));
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
    static int [][] chuyenVi(int[][] inputMatrix, int[][] outputMatrix){
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[0].length; j++) {
                outputMatrix[j][i] = inputMatrix[i][j];
            }
        }
        return outputMatrix;
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