package array;
import java.util.Scanner;
public class Bai15 {

    public static void main(String[] args) {
        int n = nhapSo("Nhap so phan tu cua mang: ");
        int arr[] = nhapMang(n);
        inRaMang(arr, "Mang vua nhap la: ");
        System.out.println("-------------------------");
        int[] mang = sapXepNoiBot(arr);
        inRaMang(mang,"Mang sau khi sap xep:");
        int x = nhapSo("Nhap so X: ");
        int [] a = chenSoX(arr, x);
        inRaMang(a, "Mang sau khi chen X: ");
    }
    static int nhapSo(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextInt();
    }
    static int[] nhapMang(int a) {

        int ar[] = new int[a];
        for (int i = 0; i < a; i++) {
            ar[i] = nhapSo(" Phan tu thu: ["+i+"]= ");
        }
        return ar;
    }
    static int[] sapXepNoiBot(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] chenSoX(int[] arr, int x) {
        int m = arr.length - 1;
        int n = arr.length;
        int[] ar = new int[n + 1];
        boolean ketQua = false;

        for (int i = n; i >= 0; i--) {
            if (m > -1 && arr[m] > x) {
                ar[i] = arr[m--];
            } else {
                if (!ketQua) {
                   ar[i] = x;
                    ketQua = true;
                } else {
                    ar[i] = arr[m--];
                }
            }
        }
        return ar;
    }
    static void inRaMang(int[] mang, String thongDiep) {
        System.out.print(thongDiep + "[ ");
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println(" ]");
    }
}