package hoangyen0507;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên thứ nhất: ");
        int num1 = nhapSoNguyen(scanner);

        System.out.print("Nhập số nguyên thứ hai: ");
        int num2 = nhapSoNguyen(scanner);

        int sum = tinhTong(num1, num2);
        System.out.println("Tổng hai số nguyên là: " + sum);
    }

    public static int nhapSoNguyen(Scanner scanner) {
        while (true) {
            try {
                int num = scanner.nextInt();
                if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
                    System.out.println("Lỗi: Số quá lớn. Vui lòng nhập lại.");
                    continue;
                }
                return num;
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Bạn đã nhập không phải số nguyên. Vui lòng nhập lại.");
                scanner.nextLine();
            }
        }
    }

    public static int tinhTong(int num1, int num2) {
        return num1 + num2;
    }
}


