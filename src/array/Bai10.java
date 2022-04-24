package array;
import java.util.Scanner;

public class Bai10 {

    public static void main(String[] args) {
        int n = nhapSo(" Nhap so phan tu: ");
        int[] arr = nhapMang(n);
        inMang(arr);
        int[] mang = sapXepNoiBot(arr);
        inMang(mang);
        System.out.println("Phan tu hien nhieu nhat: " + phanTuXuatHienNhieuNhat(arr));
        phanTu(arr);
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
    static int[] sapXepNoiBot(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    static int phanTuXuatHienNhieuNhat(int[] arr) {
        arr = sapXepNoiBot(arr);
        int count = 0, maxCount = 0, viTri = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
                continue;
            }
            if (count > maxCount) {
                maxCount = count;
                count = 0;
                viTri = arr[i];
            }
        }
        return viTri;
    }
    static void phanTu(int[] arr) {
        int max = 0;
        int[] b = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++)
                if (arr[i] == arr[j]) b[i]++;
            }
            max = b[0];
            for (int i = 1; i < arr.length; i++)
                if (b[i] > max)
                    max = b[i];
            for (int i = 0; i < arr.length; i++)
                if (b[i] == max)
                    System.out.println("So "+arr[i]+ " co so lan xuat hien nhieu nhat la: "+max);
        }
    }
