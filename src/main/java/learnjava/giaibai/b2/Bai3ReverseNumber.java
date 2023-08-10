package learnjava.giaibai.b2;

import java.util.Scanner;

public class Bai3ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt(); // 123

        int reversedNumber = 0; // = 0
        while (number != 0) {
            int digit = number % 10;// 3       round2  digit = 2  round 3  = 1
            reversedNumber = reversedNumber * 10 + digit; // 0 * 10  + 3  , round2 =  3 * 10 + 2 = 32 , round 3 = 32 * 10 + 1
            number /= 10; // munber = nuber/10 = 12  round 2: 12/10 = 1   round 3 = 1/10 = 0
        }

        System.out.println("Số đảo ngược: " + reversedNumber);

        scanner.close();
    }

}
