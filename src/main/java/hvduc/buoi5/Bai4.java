package hvduc.buoi5;

import java.util.Scanner;

public class Bai4
{
    public static void main(String args[]) {
        System.out.println("Nhập chuỗi: ");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String[] st2 = st.split("\\s");
        System.out.println("Tách các từ trong chuỗi: ");
        for (String x : st2) {
            System.out.println(x);
        }
    }
}
