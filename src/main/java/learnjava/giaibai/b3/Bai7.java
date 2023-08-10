package learnjava.giaibai.b3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Bai7 {
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

        HashSet<String> uniqueStrings = new HashSet<>(stringList);

        stringList.clear();

        stringList.addAll(uniqueStrings);

        System.out.println("Danh sách sau khi xóa các chuỗi trùng lặp:");

        for (String str : stringList) {

            System.out.println(str);

        }

    }
}
