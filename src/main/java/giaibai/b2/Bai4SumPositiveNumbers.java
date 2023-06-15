package giaibai.b2;

import java.util.Scanner;

public class Bai4SumPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        System.out.println("Nhập các số nguyên dương (nhập 0 để kết thúc):");

        while (true) {
            System.out.print("Nhập số nguyên dương: ");
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number > 0) {
                sum += number;
            }
        }

        System.out.println("Tổng các số dương: " + sum);

        scanner.close();
    }

}
