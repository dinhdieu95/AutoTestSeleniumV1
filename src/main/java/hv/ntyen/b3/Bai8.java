package hv.ntyen.b3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

//Cho một danh sách các số nguyên, viết chương trình để tính tổng các phần tử của danh sách đó.
public class Bai8 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        for (int i = 0 ; i < 5 ; i++){
            System.out.println("Nhap phan tu thu " + i);
            int n = s.nextInt();
            arr.add(n);
        }
        System.out.println("Danh sach cac so vua nhap:");
        System.out.println(arr);
        Integer tong = 0;
        for (int i = 0 ; i < arr.size() ; i++){
            tong += (Integer) arr.get(i);
        }
        System.out.println("Tong cua cac phan tu la " + tong);

    }
}
