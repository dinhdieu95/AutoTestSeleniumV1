package hanhttm_bt_javacore.exeption;

import java.util.Scanner;

public class SumInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            int a = scanner.nextInt();
        } catch (NullPointerException e){
            System.out.println("Nhap so duong");
        }

        int b = scanner.nextInt();

    }
    public static int sum(int a, int b){
        return  a+ b;
    }

}
