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
            number = scanner.nextInt();//  round 2   12  round 3 = 0

            if (number <= 0) {
                break; // thực hiện round 3
            }
            else {
                sum += number; // round 1` : sum = 0 + 13   round 2 sum = 13 + 12 = 25
            }

        }

        System.out.println("Tổng các số dương: " + sum);

        scanner.close();
    }

}
