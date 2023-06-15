package giaibai.b1;

import java.util.Scanner;

public class Bai2KoTraVe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        tinhTong(a, b);

        scanner.close();
    }

    public static void tinhTong(int a, int b) {
        System.out.println("Tổng của " + a + " và " + b + " là: " + (a+b));
//        return a + b;
    }
}
