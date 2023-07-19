package hanhttm_bt_javacore.array;

import java.util.Scanner;

//Cho một mảng số nguyên đã được sắp xếp theo thứ tự tăng dần.
// Viết chương trình để chuyển đổi mảng thành một mảng mới với tất cả các phần tử được bình phương.
//Luoi qua nen sua ham sap xep thanh hang binh phuong =))
public class Array2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu cua mang: ");
        int n=scanner.nextInt();
        int [] arr=new int[n];
        inputArray(arr,n,scanner);
        squareMem(arr);
        System.out.println("Day so moi sau khi binh phuong la: \n");
        showArray(arr);
    }
    public static void inputArray(int[] arr, int n, Scanner sc){
        System.out.println("Nhap cac phan tu cua mang: \n");
        for (int i=0;i<n;i++){
            System.out.printf("a[%d] = " , i );
            arr[i]=sc.nextInt();
        }
    }
    public static void squareMem(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                arr[i]=arr[i]*arr[i];
            }
    }

    public static void showArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
