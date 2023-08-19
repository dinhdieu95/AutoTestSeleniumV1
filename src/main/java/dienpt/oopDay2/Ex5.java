package dienpt.oopDay2;

import java.util.InputMismatchException;
import java.util.Scanner;

//5. Tính tổng của hai số nguyên nhập vào từ bàn phím
//
//        Yêu cầu:
//        Viết một phương thức để tính tổng của hai số nguyên nhập vào từ bàn phím.
//        Xử lý các trường hợp ngoại lệ sau:
//        Nếu người dùng nhập không phải số nguyên, in thông báo lỗi và yêu cầu nhập lại.
//        Nếu người dùng nhập số quá lớn, in thông báo lỗi và yêu cầu nhập lại.
//        Viết chương trình chạy thử để kiểm tra phương thức đã cài đặt.
public class Ex5 {

    public int sum(int firtNumber, int secondNumber) {
        return firtNumber + secondNumber;
    }

    public int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        boolean isNumber = false;
        int input = 0;
        while (!isNumber) {
            try {
                System.out.print("Nhap vao so: ");
                input = scanner.nextInt();
                isNumber = true;
            } catch (Exception e) {
                System.out.println("Vui long nhap vao gia tri la so.");
                scanner.next();
            }
        }
        return input;
    }

    public int nhapVaoSoQuaLon() {
        Scanner scanner = new Scanner(System.in);
        boolean isNumber = false;
        int input = 0;
        while (!isNumber) {
            try {
                System.out.print("Nhap vao so: ");
                input = scanner.nextInt();
                isNumber = true;
            } catch (InputMismatchException e) {
                System.out.println("nhập số quá lớn, in thông báo lỗi và yêu cầu nhập lại.");
                scanner.next();
            }
        }
        return input;
    }

    public static void main(String[] args) {
        Ex5 ex25 = new Ex5();

        int firstNumber = ex25.inputNumber();
        int secondNumber = ex25.inputNumber();

        System.out.println("Total: " + ex25.sum(firstNumber, secondNumber));

        firstNumber = ex25.nhapVaoSoQuaLon();
        secondNumber = ex25.nhapVaoSoQuaLon();
        System.out.println("Total: " + ex25.sum(firstNumber, secondNumber));
    }
}
