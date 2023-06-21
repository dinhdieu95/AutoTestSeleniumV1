//Cho một chuỗi bất kỳ, hãy viết chương trình để kiểm tra xem chuỗi đó có phải là chuỗi đối xứng hay không.
package hv.ntyen.b4_String;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi st: ");
        String st = sc.nextLine();
        System.out.println("Chuỗi st được viết hoa là " +st.toUpperCase());
    }
}
