//Cho một chuỗi bất kỳ, viết chương trình để đảo ngược chuỗi đó.
package hv.ntyen.b4_String;

import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kỳ: ");
        String st = sc.nextLine();
        System.out.println();
        StringBuilder ts = new StringBuilder(st);
        System.out.println("Chuỗi đảo ngược là: " +ts.reverse().toString());
    }
}
