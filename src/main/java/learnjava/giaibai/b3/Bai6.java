package learnjava.giaibai.b3;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai6 {
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

        int min = numberList.get(0);

        int max = numberList.get(0);

        for (int i = 1; i < numberList.size(); i++) {

            int num = numberList.get(i);

            if (num < min) {

                min = num;

            }

            if (num > max) {

                max = num;

            }

        }

        System.out.println("Số nhỏ nhất: " + min);

        System.out.println("Số lớn nhất: " + max);

    }
}
