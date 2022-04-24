package array;
/**
Sắp xếp dãy số bất kì theo thứ tự tăng dần và giảm dần
 */
import java.util.Scanner;
public class Bai02 {
    public static void main(String[] args) {
        int [] arr = nhapMang();
        System.out.println("Mảng vừa nhập là: ");
        inRaMang(arr);
        System.out.println(" Sắp xếp tăng dần");
        sapXepTangDan(arr);
        System.out.println("Sắp xếp giảm dần");
        sapXepGiamDan(arr);
    }
    public static int [] nhapMang(){
        System.out.println(" Nhập số lượng phần tử của mảng: ");
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        int daySo [] = new int [n];
        for (int i = 0; i < n; i++){
            System.out.println(" Xin mời nhập phần tử thứ " +(i+1)+"  của mảng :");
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
    public static void sapXepTangDan(int[] arr){
        for ( int i = 0; i < arr.length-1; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ]");
        }
    public static void sapXepGiamDan(int[] arr) {
        for ( int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] > arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ]");
    }
    }
