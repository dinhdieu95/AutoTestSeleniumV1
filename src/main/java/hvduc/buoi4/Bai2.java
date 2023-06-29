package hvduc.buoi4;

import java.util.Scanner;

public class Bai2 {
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
        sortDsc(arrays);
        System.out.println("Mảng:");
        show(arrays);
        System.out.println("\nMảng mới: ");
        pow(arrays);
        show(arrays);
    }
    public static void sortDsc ( int[] arr){ //Sắp xếp giá trịn của mảng
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void show ( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void pow(int[] arr){
        for (int i = 0; i < arr.length; i ++){
            arr[i] = (int) Math.pow(arr[i],2);
        }
    }
}
