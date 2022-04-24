package array;
import java.util.Scanner;

public class Bai08 {
    public static void main(String[] args) {
        int n = inputNumber("So phan tu cua mang la: ");
        int[] matrix = inputmatrix(n);
        inRaMang(matrix);
        trungBinhCong(matrix);
        System.out.println("So nguyen to trong mang");
       soNT(matrix);
    }

    static int inputNumber(String inputmessage) {
        System.out.print(inputmessage);
        return new Scanner(System.in).nextInt();
    }

    static int[] inputmatrix(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inputNumber("Phan tu vi tri thu " + (i + 1) + " : ");
        }
        return arr;
    }

    static void inRaMang(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ]");
    }

    static void trungBinhCong(int[] arr) {
        int tong = 0, tong1 = 0;
        int dem = 0, dem1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (0 > arr[i]) {
                tong = tong + arr[i];
                dem++;
            } else {
                tong1 = tong1 + arr[i];
                dem1++;
            }
        }
        System.out.println(" TBC so Am: " + (float) tong / dem + " va TBC so Duong: " + (float) tong1 / dem1 + "");
    }

    static boolean kiemTraSoNT(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    static void soNT(int [] arr){
        for (int i = 2; i< arr.length; i++){
            if (kiemTraSoNT(arr[i])){
                System.out.print( arr[i] + " " );
            }
        }
    }
}