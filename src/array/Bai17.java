package array;
import java.util.Scanner;
public class Bai17 {

    public static void main(String[] args) {
        int n = nhapSo("Nhap so phan tu cua mang: ");
        int arr[] = nhapMang(n);
        inRaMang(arr, "Mang vua nhap la: ");
       timViTri(arr);

    }
    static int nhapSo(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextInt();
    }
    static int[] nhapMang(int a) {

        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = nhapSo("Phan tu thu: ["+i+"]= ");
        }
        return arr;
    }
     static void timViTri (int[] arr) {
        int dem = 0, viTri = 0, x = 0;
        int n = arr.length-1;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i+1]) {
                dem++;
                if (dem > x) {
                    x = dem;
                    viTri = i;
                }
            }
        }
         System.out.println("Vi tri bat dau: "+(viTri - x + 1)+":  Do dai cua duong chay: "+(x+1)+"");
    }
    static void inRaMang(int[] mang, String thongDiep) {
        System.out.print(thongDiep + "[ ");
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println(" ]");
    }
}