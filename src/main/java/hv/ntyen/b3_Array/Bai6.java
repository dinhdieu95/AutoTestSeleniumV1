package hv.ntyen.b3_Array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

//Viết chương trình nhập vào một danh sách các số nguyên và tìm số lớn nhất và số nhỏ nhất trong danh sách đó.
public class Bai6 {
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
        arr.sort(Comparator.naturalOrder());
        System.out.println("So lon nhat la: " + arr.get(arr.size() - 1));
        System.out.println("So nho nhat la: " + arr.get(0));

    }
}
