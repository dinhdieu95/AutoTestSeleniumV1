package giaibai.b3;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng của tam giác Pascal: ");

        int numRows = scanner.nextInt();

        for (int i = 0; i < numRows; i++) {

            int num = 1;

//            System.out.printf("%" + (numRows - i) * 2 + "s", ""); // Thêm khoảng trống

            for (int j = 0; j <= i; j++) {

                System.out.printf("%4d", num);

                num = num * (i - j) / (j + 1);

            }

            System.out.println();

        }

    }
}
