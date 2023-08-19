package dienpt.StringinJava;

import java.util.Scanner;

public class Ex4_TachChuoi_In {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        String chuoi = scanner.nextLine();

        // Cat thanh mang cach nhau boi dau cach
        String [] tu = chuoi.split(" " );
        System.out.println("Tu trong chuoi la: ");
        for (int i = 0; i < tu.length; i++) {
            System.out.println(tu[i]);
        }
    }
}
