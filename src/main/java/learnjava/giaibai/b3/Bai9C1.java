package learnjava.giaibai.b3;

import java.util.Scanner;

public class Bai9C1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        int number;

        System.out.println("Nhập các số dương (nhập số 0 để kết thúc):");

        do {

            number = scanner.nextInt();

            if (number > 0) {

                sum += number;

            }

        } while (number != 0);

        System.out.println("Tổng các số dương: " + sum);

    }
}
