package learnjava.run.regix;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập email: ");
        String phoneNumber = scanner.nextLine();

        if (isValidPhoneNumber(phoneNumber)) {
            System.out.println("email hợp lệ");
        } else {
            System.out.println("email không hợp lệ");
        }
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Định nghĩa biểu thức chính quy kiểm tra email
        String regex = "^[0-9a-zA-Z]+@[0-9a-zA-Z]+\\*[0-9a-zA-Z]$";

        // Tạo đối tượng Pattern từ biểu thức chính quy
        Pattern pattern = Pattern.compile(regex);

        // Tạo đối tượng Matcher từ chuỗi cần kiểm tra
        Matcher matcher = pattern.matcher(phoneNumber);

        // Kiểm tra xem chuỗi có khớp với biểu thức chính quy hay không
        return matcher.matches();
    }
}
