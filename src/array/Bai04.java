package array;
/**
 * Nhập dãy các số nguyên {a[0], 2, 3,...,a[n-1]} và số x
 * sau đó đếm số lần xuất hiện x trong dãy .
*/
import java.util.Scanner;
public class Bai04 {
    public static void main(String[] args) {
        int[] arr = nhapMang();
        inRaDaySo(arr);
        System.out.print(" Nhập vào một số x bất kì: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int dem = 0;
        timKiem(arr, x, dem);
    }
    public static int[] nhapMang() {
        System.out.println(" Nhập số lượng phần tử của dãy số: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int daySo[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(" Xin mời nhập số thứ " + (i + 1) + " của dãy số: ");
            int temp = scanner.nextInt();
            daySo[i] = temp;
        }
        return daySo;
    }
    public static void inRaDaySo(int[] arrInput) {
        System.out.print("[ ");
        for (int i = 0; i < arrInput.length; i++) {
            System.out.print(arrInput[i] + " ");
        }
        System.out.println(" ]");
    }
    public static void timKiem(int[] arr, int x, int dem) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("Không có số X trong dãy số");
        }else{
            System.out.println("Số lần X xuất hiện trong dãy số là: " +dem);
        }
    }
}
