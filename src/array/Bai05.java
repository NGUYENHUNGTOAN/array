package array;
/**
 Nhập dãy các số nguyên  {a[0],...,a[n-1]}
 sau đó tìm số lớn thứ hai và vị trí của nó trong dãy.
*/
import java.util.Scanner;
public class Bai05 {
    public static void main(String[] args) {
        int[] arr = nhapMang();
        System.out.println("Dãy số vừa nhập là: ");
        inRaMang(arr);
        System.out.println("----------------");
        int ketqua = max(arr);
        System.out.println("So lon nhat la: "+ketqua);
       max2(arr);
    }

    public static int[] nhapMang() {
        System.out.print(" Nhập số lượng phần tử của dãy số: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int daySo[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(" Xin mời nhập phần tử thứ " + (i + 1) + "  của dãy số :");
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

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void max2(int[] arr) {
        int n = max(arr);
        int max2 = arr[0], vitri = 0;
        int coutn = 0, coutbangNhau = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max2 && arr[i] != n) {
                max2 = arr[i];
                vitri = i;
            }
            if (arr[i] == arr[i - 1]) {
                coutbangNhau++;
            }
            coutn++;
        }
        if (coutn == coutbangNhau){
            System.out.println("Khong co so lon thu hai");
            return;
        }
        System.out.println("So lon thu hai: "+max2+" vi tri la: "+vitri+" ");
    }
}
