//Cho một chuỗi bất kỳ, hãy viết chương trình để kiểm tra xem chuỗi đó có phải là số nguyên dương hay không.
package hv.ntyen.b4_String;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi st: ");
        String st = sc.nextLine();
        if (isNumeric(st)){
            System.out.println("Chuỗi st là các số nguyên dương");
        } else
            System.out.println("Chuỗi st không phải là các số nguyên dương: ");
    }
    public static boolean isNumeric(String str) {
        return str.matches("^[1-9]\\d*$");  //match a number with optional '-' and decimal.

    }
}
