package hvduc.buoi4;

import java.util.Scanner;

public class Bai3 {
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
        findMax(arrays);
    }
    public static void show ( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void findMax(int[] arr){
        int max = 0;
        for (int i : arr){
            if (max<i){
                max = i;
            }
        }
        System.out.println("\nSố lớn nhất là: " +max);
    }
}
