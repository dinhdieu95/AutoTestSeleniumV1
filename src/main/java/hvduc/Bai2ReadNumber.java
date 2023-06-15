package hvduc;

import java.util.Scanner;

public class Bai2ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Nhập số nguyên (nhập 0 để thoát): ");
            number = scanner.nextInt();

            System.out.println("Số bạn vừa nhập: " + number);
        } while (number != 0);

        scanner.close();
        System.out.println("Chương trình kết thúc.");
    }

}
