package array;
import java.util.Scanner;
public class Bai06 {

        public static void main(String[] args) {
            int b = inputNumber(" Nhap so b: ");
            int c = inputNumber("Nhap so c: ");
            int n = inputNumber("So phan tu cua mang la: ");
            int[] matrix = inputmatrix(n);
            inRaMang(matrix);
            trungBinhCong(matrix, b, c);
        }

        static int inputNumber(String inputmessage) {
            System.out.print(inputmessage);
            return new Scanner(System.in).nextInt();
        }

        static int[] inputmatrix(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = inputNumber("Phan tu vi tri thu " + (i + 1) + " : ");
            }
            return arr;
        }

        static void inRaMang(int[] arr) {
            System.out.print("[ ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(" ]");
        }
    static void trungBinhCong (int [] arr, int b, int c){
        int tong = 0;
        int dem = 0;
        for (int i = 0; i < arr.length; i++) {
            if ( b < arr[i] && arr[i] < c) {
                tong = tong + arr[i];
                dem++;
            }else {
                System.out.println(" Khong co gia tri nao trong [b,c]");
                return;
            }
        }
        System.out.println(" TBC trong khoang [b, c] la: " + (float) tong/dem);
    }
}
