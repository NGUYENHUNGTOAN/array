package array;
import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        int[][] mangHaiChieu = nhapMangHaiChieu();
        inMangHaiChieu(mangHaiChieu);
        System.out.println("--------------------------");
        timKiemMaxMin(mangHaiChieu);
    }
    static int[][] nhapMangHaiChieu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng M: ");
        int soHang = scanner.nextInt();
        System.out.print("Nhập số cột N: ");
        int soCot = scanner.nextInt();
        int[][] mangHaiChieu = new int[soHang][soCot];
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhập phần tử vị trí thứ ["+(i+1)+ " , "+(j+1)+" ]: ");
                mangHaiChieu[i][j] = scanner.nextInt();
            }
        }
        return mangHaiChieu;
    }
    static void inMangHaiChieu(int[][] mangHaiChieu) {
        for (int i = 0; i < mangHaiChieu.length; i++) {
            for (int j = 0; j < mangHaiChieu[0].length; j++) {
                System.out.print(mangHaiChieu[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void timKiemMaxMin(int[][] mangHaiChieu) {
        int max = mangHaiChieu[0][0], min = mangHaiChieu[0][0];
        int m = 0, n = 0, p = 0, q = 0;
        for (int i = 0; i < mangHaiChieu.length; i++) {
            for (int j = 0; j < mangHaiChieu[0].length; j++) {
                if (mangHaiChieu[i][j] <= min) {
                    min = mangHaiChieu[i][j];
                    m = i;
                    n = j;
                }
                if (mangHaiChieu[i][j] >= max) {
                    max = mangHaiChieu[i][j];
                    p = i;
                    q = j;
                }
            }
        }
        if (max==min){
            System.out.println("Các phần tử bằng nhau nên không có số lớn nhất, nhỏ nhất");
            return;
        }
        System.out.println("Số nhỏ nhất là: ("+min+") Vị trí hàng ["+m+"] cột ["+n+"] ");
        System.out.println("Số lớn nhất là: ("+max+") Vị trí hàng ["+p+"] cột ["+q+"] ");
    }
}
