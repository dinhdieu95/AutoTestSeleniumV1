//Cho một chuỗi bất kỳ, hãy viết chương trình để tách từ trong chuỗi và in từ đó.
package hv.ntyen.b4_String;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi st1: ");
        String st = sc.nextLine();
        char kt;
        for (int i = 0; i < st.length(); i++) {
            kt = st.charAt(i);
            // kiểm tra ký tự có phải là khoảng trắng không
            if (Character.isSpace(kt)) {
                // Nếu ký tự đó là khoảng trắng thì xuống dòng
                System.out.println();
            } else {
               // Nếu không là khoảng trắng thì hiển thị ký tự đó trên 1 dòng, gặp khoảng trắng thì xuống dòng.
                System.out.print(kt);
            }
        }

    }
}
