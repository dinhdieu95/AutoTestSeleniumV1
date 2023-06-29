package run.regix;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();

        if (isValidPhoneNumber(phoneNumber)) {
            System.out.println("Số điện thoại hợp lệ");
        } else {
            System.out.println("Số điện thoại không hợp lệ");
        }
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Định nghĩa biểu thức chính quy kiểm tra số điện thoại
        String regex = "^(0|\\+84)[0-9a-z]{8,11}$";

        // Tạo đối tượng Pattern từ biểu thức chính quy
        Pattern pattern = Pattern.compile(regex);

        // Tạo đối tượng Matcher từ chuỗi cần kiểm tra
        Matcher matcher = pattern.matcher(phoneNumber);

        // Kiểm tra xem chuỗi có khớp với biểu thức chính quy hay không
        return matcher.matches();
    }

}
