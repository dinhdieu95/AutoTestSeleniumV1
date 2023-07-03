package hanhttm_bt_javacore.exeption;

import java.util.InputMismatchException;
import java.util.Scanner;


public class SumInteger {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        a = validateInput(scanner, a);
        int b = 0;
        b = validateInput(scanner, b);
        System.out.println("sum: " + sum(a, b));
    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int validateInput(Scanner scanner, int a) throws Exception {
        boolean booleanInt = false;
        while (!booleanInt || a > 1000) {
            try {
                a = scanner.nextInt();
                System.out.println("so nhap: " + a);
                booleanInt = true;
            } catch (InputMismatchException e) {
                System.out.println("not integer");
                scanner.next();
            }
        }
        return a;
    }


}
