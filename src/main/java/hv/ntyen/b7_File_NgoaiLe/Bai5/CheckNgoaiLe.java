package hv.ntyen.b7_File_NgoaiLe.Bai5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckNgoaiLe {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Nhập vào số nguyên thứ nhất: ");
            n1 = sc.nextInt();
            System.out.print("Nhập vào số nguyên thứ hai: ");
            n2 = sc.nextInt();
            int sum = n1+n2;
            System.out.print("Tổng của 2 số nguyên là: " +sum);
        } catch (Exception e) {
            System.out.println("Nhập dữ liệu không đúng.");
        }

    }

}
