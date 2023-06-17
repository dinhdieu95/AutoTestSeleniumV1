package hv.ntyen.b3;

import java.util.*;

//Viết chương trình nhập vào một danh sách các chuỗi và sắp xếp chúng theo thứ tự tăng dần.
public class Bai5 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        for (int i = 0 ; i < 5 ; i++){
            System.out.println("Nhap phan tu thu " + i);
            String n = s.next();
            arr.add(n);
        }
        System.out.println("Danh sach chuoi chua sap xep:");
        System.out.println(arr);
        arr.sort(Comparator.naturalOrder());
        System.out.println("Danh sach chuoi sap xep theo thu tu tang dan:");
        System.out.println(arr);
    }
}
