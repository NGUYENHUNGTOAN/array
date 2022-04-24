package array;

import java.util.Scanner;

public class Bai07 {
    public static void main(String[] args) {
        int n = inputNumber("So phan tu cua mang la: ");
        int[] matrix = inputmatrix(n);
        inRaMang(matrix);
        int dem = 0;
        demChanLe(matrix);
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

    static void demChanLe(int[] arr) {
        int chan = 0, le = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                chan++;
            } else {
                le++;
            }
        }
        System.out.println("So chan la: "+chan+" va so le la: "+le+" ");
    }
}
