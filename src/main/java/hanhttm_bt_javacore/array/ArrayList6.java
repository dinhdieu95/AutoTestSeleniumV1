package hanhttm_bt_javacore.array;

import java.util.ArrayList;
import java.util.Scanner;

//Viết chương trình nhập vào một danh sách các số nguyên và tìm số lớn nhất và số nhỏ nhất trong danh sách đó.
public class ArrayList6 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu cua mang: ");
        int n=scanner.nextInt();
        ArrayList<Integer> arr=new  ArrayList<>();
        inputArray(arr,n,scanner);
        maxValue(arr);
        minValue(arr);

    }
    public static void inputArray(ArrayList<Integer> arr, int n, Scanner sc){
        System.out.println("Nhap cac phan tu cua mang: \n");
        for (int i=0;i<n;i++){
            System.out.printf("a[%d] = " , i );
            arr.add(sc.nextInt());
        }
    }
    public static void maxValue(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 0; i < arr.size(); i++)
            if (arr.get(i) > max) max = arr.get(i);
        System.out.printf("gia tri lon nhat mang la : %d \n", max);
    }
    public static void minValue(ArrayList<Integer> arr) {
        int min = arr.get(0);
        for (int i = 0; i < arr.size(); i++)
            if (arr.get(i) <min) min = arr.get(i);
        System.out.printf("gia tri nho nhat mang la : %d", min);
    }
}
