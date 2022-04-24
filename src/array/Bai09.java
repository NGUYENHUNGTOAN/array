package array;
import java.util.Scanner;

public class Bai09 {

    public static void main(String[] args) {
        int n = nhapSo("So phan tu cua mang la: ");
        int[] matrix = nhapMang(n);
        inRaMang(matrix);
        if (kiemTraDoiXung(matrix)){
            System.out.println("Mang doi xung");
        }else{
            System.out.println("Mang khong doi xung");
        }
    }
    static int nhapSo(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextInt();
    }
    static int[] nhapMang(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nhapSo("Phan tu thu " + (i + 1) + " : ");
        }
        return arr;
    }
    static boolean kiemTraDoiXung(int[] ar){
        for (int i = 0; i < ar.length/2; i++) {
            if (ar[i] != ar[ar.length-i-1]) {
                return false;
            }
        }
        return true;
    }
    static void inRaMang(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ]");
    }
}