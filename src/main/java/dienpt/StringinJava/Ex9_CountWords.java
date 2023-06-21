package dienpt.StringinJava;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex9_CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi: ");
        String str = scanner.nextLine();
        String [] tu = str.split(" ");
        System.out.println(tu);
        System.out.println("Số từ có trong chuỗi \"" + str + "\" = " + tu.length);
    }
}
