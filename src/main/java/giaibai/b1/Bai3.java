package giaibai.b1;

import java.util.Scanner;// khai báo thư  viện

public class Bai3   {
    public static void main(String[] args) { // function  //(String[] args)  => tham số
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int soNguyen = scanner.nextInt();

        System.out.print("Nhập một số thực: ");
        double soThuc = scanner.nextDouble();

        double ketQua = congHaiSo(soNguyen, soThuc);

        System.out.println("Kết quả của phép cộng là: " + ketQua);
        System.out.println("Kết quả của phép cộng trả về số nguyên là: " + congHaiSoKieuTraVe(soNguyen, soThuc));

        scanner.close();
    }

    public static double congHaiSo(int a, double b) {
        return a + b;
    }
    public static int congHaiSoKieuTraVe(int a, double b) {
        return a + (int) b;
    }
}
