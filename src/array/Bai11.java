package array;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        int n = nhapSo(" Nhap so phan tu: ");
        int[] arr = nhapMang(n);
        inMang(arr);
        int x = nhapSo(" Nhap so X: ");
        System.out.println(" Vi tri gan "+x+" nhat la: " + viTri(arr, x));
    }

    static int nhapSo(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextInt();
    }

    static int[] nhapMang(int n) {
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = nhapSo("Nhap phan tu mang arr [" + i + "] = ");
        }
        return ar;
    }

    static void inMang(int[] ar) {
        System.out.print("[ ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println(" ]");
    }
    static int viTri(int [] arr, int x){
        int KetQua = 0, khoangCach = Math.abs(arr[0] - x);
        for (int i = 1; i < arr.length; i ++){
            int abs = Math.abs(arr[i] -x );
            if (abs < khoangCach){
                khoangCach = abs;
                KetQua = i;
            }
        }
        return KetQua;
    }
}