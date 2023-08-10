package learnjava.giaibai.b7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;
        boolean check = true;

        while (check) {
            try {
                System.out.print("Nhập số nguyên thứ nhất: ");
                number1 = readInteger(scanner);

                System.out.print("Nhập số nguyên thứ hai: ");
                number2 = readInteger(scanner);

                int sum = calculateSum(number1, number2);
                System.out.println("Tổng hai số nguyên là: " + sum);
                check = false;
            }
//            catch (NumberFormatException e) {
//                System.out.println("Lỗi: Bạn đã nhập không phải số nguyên.");
//            }
            catch (IllegalArgumentException e) {
                System.out.println("Lỗi: Bạn đã nhập số quá lớn.");
            }
        }
        scanner.close();
    }

    public static int readInteger(Scanner scanner) throws NumberFormatException {
        int number;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.next(); // Đọc và loại bỏ giá trị không phải số nguyên
            throw new NumberFormatException();
        }
        if (number > Integer.MAX_VALUE) {
            throw new IllegalArgumentException();
        }
        return number;
    }

    public static int calculateSum(int a, int b) {
        return a + b;
    }
}
