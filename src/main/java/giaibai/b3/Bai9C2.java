package giaibai.b3;

import java.util.Scanner;

public class Bai9C2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        int number;

        System.out.println("Nhập các số dương (nhập số 0 để kết thúc):");

        while ((number = scanner.nextInt()) != 0) {

            if (number > 0) {

                sum += number;

            }

        }

        System.out.println("Tổng các số dương: " + sum);

    }
}
