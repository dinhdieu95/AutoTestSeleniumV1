//Cho một chuỗi bất kỳ, hãy viết chương trình để chuyển đổi chuỗi thành chuỗi chỉ chứa các ký tự in hoa.
package hv.ntyen.b4_String;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi st: ");
        String st = sc.nextLine();
        System.out.println("Chuỗi st được viết hoa là " +st.toUpperCase());
    }
}
