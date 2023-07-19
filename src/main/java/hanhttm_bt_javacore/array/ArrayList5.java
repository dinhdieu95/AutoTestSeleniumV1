package hanhttm_bt_javacore.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayList5 {
   // Viết chương trình nhập vào một danh sách các chuỗi và sắp xếp chúng theo thứ tự tăng dần
   public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Nhap so phan tu cua mang: ");
        int n=scanner.nextInt();
        ArrayList<String> arr=new  ArrayList<>();
        inputArrayList(arr,n,scanner);
        System.out.println("Mảng chưa sắp xếp: " + arr);
        arr.sort(Comparator.naturalOrder());
        System.out.println("Mảng sau khi sắp xếp tăng dần: " +arr);
        arr.sort(Comparator.reverseOrder());
        System.out.println("Mảng sau khi sắp xếp giam dần: " +arr);

    }
    public static void inputArrayList(ArrayList<String> arrList, int n, Scanner sc)
    {
        System.out.println("Nhap cac phan tu cua mang: \n");
        sc.nextLine();
        for (int i=0;i<n;i++){
            System.out.printf("a[%d] = " , i );
                     arrList.add(sc.nextLine());
        }
    }
    //public static void sortList(String[] arrList)
}
