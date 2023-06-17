package giaibai.b3;

import java.util.ArrayList;
import java.util.Scanner;

//Viết chương trình Java sử dụng vòng lặp while để tính tổng các số dương nhập từ bàn phím.
public class Bai9 {
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
                while ((Integer) arr.get(i)>0) {
                    tong += (Integer) arr.get(i);
                    break;
                }
            }
        System.out.println("Tong cua cac phan tu la " + tong);
    }
}
