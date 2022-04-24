package array;

import java.util.Random;
import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        int[] arr = mangNgauNhien();
        inMang(arr);
        System.out.println("---------------------------");
        soKhacNhau(arr);
    }

    static int nhapSo(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextInt();
    }

    static int[] mangNgauNhien() {
        Random random = new Random();
        int n = nhapSo(" Nhap so phan tu cua mang: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(50);
        }
        return arr;
    }

    static void inMang(int[] ar) {
        System.out.print("[ ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println(" ]");
    }
    static void soKhacNhau(int [] arr){
        System.out.print("[ ");
        for (int  i = 0; i < arr.length; i++){
            boolean daXuatHien = false;
            for (int j = i - 1; j >= 0; j--){
                if (arr[i] == arr[j]){
                    daXuatHien = true;
                    break;
                }
            }
            if (!daXuatHien){
                System.out.print( arr[i]+ " ");
            }
        }
        System.out.println(" ]");
    }
}