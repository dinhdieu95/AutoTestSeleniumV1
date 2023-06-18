package hvduc.buoi4;

import java.util.Scanner;

public class Bai4 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        addParam();
    }
    public static void addParam() {
        System.out.println("Nhập số lượng phần tử được khởi tạo trong mảng: ");
        Integer param = sc.nextInt();
        int[] arrays = new int[param];
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Phần tử " + i + " : ");
            arrays[i] = sc.nextInt();
        }
        System.out.println("Mảng:");
        show(arrays);
        findX(arrays);
    }
    public static void show ( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void findX(int[] arr){
        System.out.println("\nNhập X là tổng của 2 cặp số trong mảng: ");
        int x = sc.nextInt();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i] + arr[j] == x && arr[i] != arr[j] ){
                    System.out.println("[" +arr[i] + "]" + "[" +arr[j] + "]");
                }
            }
        }
    }
}
