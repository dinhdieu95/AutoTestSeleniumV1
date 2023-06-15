package giaibai.b1;

import java.util.Scanner;

public class Bài2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        int tong = tinhTong(a, b);

        System.out.println("Tổng của " + a + " và " + b + " là: " + tong);
        System.out.print("Nhập số nguyên b: ");
        int c = scanner.nextInt();

        tong = tinhTong3So(a, b, c);
        System.out.println("Tổng của " + a + " và " + b + " và " + c +" là: " + tong);

        tong = tinhTong3SoVaAXB(a, b, c);
        System.out.println("Tổng của " + a + " và " + b + " và " + c +"  và " + a * b + " là: " + tong);

        scanner.close();
    }

    public static int tinhTong(int a, int b) {
        return a + b;
    }
    public static int tinhTong3So(int a, int b, int c ) {
        return a + b + c;
    }
    public static int tinhTong3SoVaAXB(int a, int b, int c ) {
        return a + b + c + a*b;
    }
}
