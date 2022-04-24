package array;
/**
 Nhập số n và dãy các số nguyên  {1, 2, 3,...,n} sau đó tìm số lớn nhất trong dãy.
*/
import java.util.Scanner;
public class Bai01 {
        public static void main(String[] args) {
            int [] arr = nhapMang();
            System.out.println("Mảng vừa nhập là: ");
            inRaMang(arr);
            System.out.println("----------------");
            maxMin(arr);
        }
        public static int [] nhapMang(){
            System.out.print(" Nhập số lượng phần tử của mảng: ");
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
        public static void maxMin(int[] arr){
            for ( int i = 0; i < arr.length-1; i++){
                for (int j = i+1; j < arr.length; j++){
                    if (arr[j]<arr[i]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("Số nhỏ nhất của mảng là: " +arr[0] + " ");
            System.out.print("Số lớn nhất của mảng là : " +arr[arr.length-1] + " ");
        }
    }
