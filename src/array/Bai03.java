package array;
/**
 * Nhập số liệu cho dãy số nguyên a[0]...a[n-1],
 * đếm xem có bao nhiêu cặp phần tử bằng nhau
*/
import java.util.Scanner;
public class Bai03 {
    public static void main(String[] args) {
        int[] arr = nhapMang();
        System.out.println("Mảng vừa nhập là: ");
        inRaMang(arr);
        System.out.println("-----------------");
        int dem = 0;
        demCapSo(arr, dem);
    }
    public static int[] nhapMang() {
        System.out.println(" Nhập số lượng phần tử của mảng: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int daySo[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(" Xin mời nhập phần tử thứ " + (i + 1) + "  của mảng :");
            int temp = scanner.nextInt();
            daySo[i] = temp;
        }
        return daySo;
    }
    public static void inRaMang(int[] arrInput) {
        System.out.print("[ ");
        for (int i = 0; i < arrInput.length; i++) {
            System.out.print(arrInput[i] + " ");
        }
        System.out.println(" ]");
    }
    public static void demCapSo(int[] arr, int dem) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    dem++;
                }
            }
        }
        if (dem == 0) {
            System.out.println("Không có cặp số nào bằng nhau");
        }else{
            System.out.println("Số lượng các cặp số bằng nhau là: " +dem);
        }
    }
}