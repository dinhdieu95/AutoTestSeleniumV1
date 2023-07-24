package run.regix;

import java.util.Scanner;

public class IPAddressValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập địa chỉ IP: ");
        String ipAddress = scanner.nextLine();

        if (isValidIPAddress(ipAddress)) {
            System.out.println("Địa chỉ IP hợp lệ.");
        } else {
            System.out.println("Địa chỉ IP không hợp lệ.");
        }
    }

    public static boolean isValidIPAddress(String ipAddress) {
        // Xâu regex để kiểm tra tính hợp lệ của địa chỉ IP
        String regex = "^(\\d{1,3}\\.){3}\\d{1,3}$";

        if (ipAddress.matches(regex)) {
            // Kiểm tra từng phần của địa chỉ IP
            String[] parts = ipAddress.split("\\.");
            for (String part : parts) {
                int value = Integer.parseInt(part);
                if (value < 0 || value > 255) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
//198.162.82.70
