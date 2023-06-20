package hvduc.buoi5;

import java.util.Scanner;

public class Bai3 {
    public static void main(String args[]) {
        System.out.println("Nhập chuỗi 1: ");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println("Nhập chuỗi 2: ");
        String st2 = sc.nextLine();
        System.out.println(st.equalsIgnoreCase(st2) ? "Trùng nhau" : "Không trùng nhau");

    }
}
