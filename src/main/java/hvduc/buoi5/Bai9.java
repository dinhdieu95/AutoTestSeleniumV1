package hvduc.buoi5;

import java.util.Scanner;

public class Bai9 {
    public static void main(String args[]) {
        System.out.println("Nhập chuỗi: ");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int count = 0;
        String[] st2 = st.split("\\s");
        for (String x : st2) {
            count++;
        }
        System.out.println("Tổng số từ có trong chuỗi là: " + count);
    }
}
