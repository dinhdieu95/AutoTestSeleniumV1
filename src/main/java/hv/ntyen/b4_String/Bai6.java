//Cho một chuỗi bất kỳ, hãy viết chương trình để kiểm tra xem chuỗi đó có phải là chuỗi đối xứng hay không.
package hv.ntyen.b4_String;

import java.util.Scanner;
import java.util.Stack;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi st: ");
        String st = sc.nextLine();
        String reverseString="";
        for ( int i = st.length() - 1 ; i >= 0 ; i-- )
            reverseString = reverseString + st.charAt(i);
        if (st.equals(reverseString))
            System.out.println("Đây là chuỗi đối xứng!");
        else
            System.out.println("Đây không phải là chuỗi đối xứng!");
    }
}
