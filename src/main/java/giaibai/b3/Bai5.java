package giaibai.b3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> stringList = new ArrayList<>();

        System.out.print("Nhập số lượng chuỗi trong danh sách: ");

        int n = scanner.nextInt();

        scanner.nextLine(); // Đọc bỏ dòng new line sau khi nhập số lượng

        System.out.println("Nhập các chuỗi vào danh sách:");

        for (int i = 0; i < n; i++) {

            String str = scanner.nextLine();

            stringList.add(str);

        }

        Collections.sort(stringList);

        System.out.println("Danh sách sau khi sắp xếp theo thứ tự tăng dần:");

        for (String str : stringList) {

            System.out.println(str);

        }

    }
}
