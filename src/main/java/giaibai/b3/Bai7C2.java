package giaibai.b3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Bai7C2 {
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

        List<String> uniqueList = new ArrayList<>();
        for (String str : stringList) {
            if (!uniqueList.contains(str)) {
                uniqueList.add(str);
            }
        }
        System.out.println("Danh sách sau khi xóa trùng lặp: " + uniqueList);


    }
}
