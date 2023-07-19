package hanhttm_bt_javacore.array;

import java.util.Scanner;

//Viết chương trình nhập vào một mảng các số nguyên và sắp xếp chúng theo thứ tự giảm dần.
public class Array1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu cua mang: ");
        int n=scanner.nextInt();
        int [] arr=new int[n];
        inputArray(arr,n,scanner);
        sortDES(arr);
        System.out.println("Day so giam dan la: \n");
        showArray(arr);
    }
    public static void inputArray(int[] arr, int n, Scanner sc){
        System.out.println("Nhap cac phan tu cua mang: \n");
        for (int i=0;i<n;i++){
            System.out.printf("a[%d] = " , i );
            arr[i]=sc.nextInt();
        }
    }
    public static void sortDES(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void showArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
