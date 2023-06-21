//Cho hai chuỗi bất kỳ, hãy viết chương trình để kiểm tra xem hai chuỗi có giống nhau hay không.
package hv.ntyen.b4_String;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi st1: ");
        String st1 = sc.nextLine();
        System.out.print("Nhập chuỗi st2: ");
        String st2 = sc.nextLine();
        boolean b = st1.equals(st2);
        if (b == true){

            System.out.println("Chuỗi st1 giống chuỗi st2");
        }else
            System.out.println("Chuỗi st1 không giống chuỗi st2");

    }
}
