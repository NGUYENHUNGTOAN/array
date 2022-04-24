package array;
import java.util.Scanner;
public class Bai16 {

    public static void main(String[] args) {
        int n = nhapSo("Nhap so phan tu cua mang: ");
        int arr[] = nhapMang(n);
        inRaMang(arr, "Mang vua nhap la: ");
        kiemTra(arr);

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
    static void kiemTra (int[] arr) {
        int n = arr.length-1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i+1]) {
                System.out.println("Mang khong phai tang dan o vi tri thu: " + (i + 1));
                return;
            }
        }
        System.out.println("Mang vua nhap la mang tang dan.");
    }

    static void inRaMang(int[] mang, String thongDiep) {
        System.out.print(thongDiep + "[ ");
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println(" ]");
    }
}