package hanhttm_bt_javacore;

import java.util.Scanner;

//sử dụng vòng lặp for để in ra tam giác Pascal với số hàng được nhập từ bàn phím.
public class Bai10Pascal {
    public static void main(String[] args) {
        int h;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều cao của tam giác: ");
        h = scanner.nextInt();
        int x, output;
        for (int i = 1; i <= h; i++) {
            for (int j = 0; j <= 2 * h; j++) {
                x = j - h;
                if (x < 0) {
                    x *= -1;
                }
                output = i - x;

                if (output > 0) {
                    System.out.printf("%3d", output);
                } else {
                    System.out.printf("   ");
                }
            }
            System.out.println();

        }
    }
}
