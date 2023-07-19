package hanhttm_bt_javacore.array;

import java.util.Scanner;

//Viết chương trình để tìm số lớn nhất trong một mảng số nguyên
public class Array3 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu cua mang: ");
        int n=scanner.nextInt();
        int [] arr=new int[n];
        inputArray(arr,n,scanner);
        maxValue(arr);
    }
    public static void inputArray(int[] arr, int n, Scanner sc){
        System.out.println("Nhap cac phan tu cua mang: \n");
        for (int i=0;i<n;i++){
            System.out.printf("a[%d] = " , i );
            arr[i]=sc.nextInt();
        }
    }
    public static void maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
                    if (arr[i] > max) max = arr[i];
        System.out.printf("gia tri lon nhat mang la : %d", max);
    }

}
