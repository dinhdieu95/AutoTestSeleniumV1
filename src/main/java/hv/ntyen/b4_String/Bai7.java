//Cho một chuỗi bất kỳ, hãy viết chương trình để xoá các khoảng trắng ở đầu và cuối chuỗi.
package hv.ntyen.b4_String;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi st: ");
        String st = sc.nextLine();
        System.out.println("Chuỗi sau khi đã xoá khoảng trắng ở đầu và cuối chuỗi là: " +st.trim());
    }
}
