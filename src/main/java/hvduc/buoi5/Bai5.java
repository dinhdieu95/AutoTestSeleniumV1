package hvduc.buoi5;

import java.util.Locale;
import java.util.Scanner;

public class Bai5 {
    public static void main(String args[]) {
        System.out.println("Nhập chuỗi: ");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println("Kết quả: " + st.toUpperCase(Locale.ROOT));
    }
}
