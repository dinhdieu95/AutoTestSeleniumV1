package hanhttm_bt_javacore;

import java.util.Scanner;

//Viết chương trình để tìm số lớn nhất trong một mảng số nguyên
public class Array4 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu cua mang: ");
        int n=scanner.nextInt();
        int [] arr=new int[n];
        inputArray(arr,n,scanner);
        System.out.println("nhap so tong: ");
        int total=scanner.nextInt();
        findCouple(arr,total);
    }
    public static void inputArray(int[] arr, int n, Scanner sc){
        System.out.println("Nhap cac phan tu cua mang: \n");
        for (int i=0;i<n;i++){
            System.out.printf("a[%d] = " , i );
            arr[i]=sc.nextInt();
        }
    }
    public static void findCouple(int[] arr,int total) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j]==total) {
                    System.out.println("cap gia tri la : " + arr[i] + " va " + arr[j]);
                }
            }
        }
    }
}
