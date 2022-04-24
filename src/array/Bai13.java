package array;
import java.util.Scanner;
public class Bai13 {

    public static void main(String[] args) {
      int [] ar = nhapMang();
        System.out.println(" Mảng vừa nhập là: ");
      inMang(ar);
    }
    static int nhapSo(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextInt();
    }
    static int [] nhapMang() {
        int n = nhapSo(" Nhập số phần tử: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nhapSo("Nhập phân tử thứ: [" + i + "] = ");
            if (kiemTra(arr, i, arr[i]) == true) {
                System.out.println(" Trùng số xin nhập lại: ");
                i--;
            }
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
    static boolean kiemTra (int [] arr, int n, int value ){
        for (int i = 0; i < n; i++ ){
            if (arr[i] == value){
                return true;
            }
        }
        return false;
    }
}