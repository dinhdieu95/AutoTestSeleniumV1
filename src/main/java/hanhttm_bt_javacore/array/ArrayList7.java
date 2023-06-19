package hanhttm_bt_javacore.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Cho một danh sách các chuỗi, viết chương trình để xóa tất cả các chuỗi trùng lặp trong danh sách đó.
public class ArrayList7 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Nhap so phan tu cua mang: ");
        int n=scanner.nextInt();
        ArrayList<String> arr=new  ArrayList<>();
        inputArrayList(arr,n,scanner);
        List<String> newArr = arr.stream().distinct().collect(Collectors.toList());
        System.out.println(newArr);
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
}
