package giaibai.b3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai6C2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = new ArrayList<>();

        System.out.print("Nhập số lượng số nguyên trong danh sách: ");

        int n = scanner.nextInt();

        System.out.println("Nhập các số nguyên vào danh sách:");

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numberList.add(num);

        }

        int min = Collections.min(numberList);
        int max = Collections.max(numberList);

        System.out.println("Số nhỏ nhất: " + min);
        System.out.println("Số lớn nhất: " + max);

    }
}
