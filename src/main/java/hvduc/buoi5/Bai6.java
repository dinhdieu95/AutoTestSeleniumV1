package hvduc.buoi5;

import java.util.Locale;
import java.util.Scanner;

public class Bai6 {
    public static void main(String args[]) {
        System.out.println("Nhập chuỗi: ");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(isSymmetry(st) ? "Chuỗi đối xứng" : "Chuỗi không đối xứng");
    }

    public static boolean isSymmetry(String str) {
        str = str.toLowerCase(Locale.ROOT);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) return false;
        }
        return true;
    }
}
