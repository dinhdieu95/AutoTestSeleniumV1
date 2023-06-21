//Cho một chuỗi bất kỳ, hãy viết chương trình để đếm số lượng ký tự trong chuỗi đó.
package hv.ntyen.b4_String;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kỳ: ");
        String st = sc.nextLine();
        int n = st.length();
        System.out.println("Số ký tự trong chuỗi là: " +n);
    }
}
