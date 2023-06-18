package giaibai.b3;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numberList = new ArrayList<>();

        System.out.print("Nhập số lượng số nguyên trong danh sách: ");

        int n = scanner.nextInt();

        System.out.println("Nhập các số nguyên vào danh sách:");

        for (int i = 0; i < n; i++) {

            int num = scanner.nextInt();

            numberList.add(num);

        }

        int sum = 0;

        for (int num : numberList) {

            sum += num;

        }

        System.out.println("Tổng các phần tử của danh sách: " + sum);

    }
}
