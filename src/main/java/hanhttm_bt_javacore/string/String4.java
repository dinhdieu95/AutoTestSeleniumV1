package hanhttm_bt_javacore.string;

import java.util.Scanner;

//4. Cho một chuỗi bất kỳ, hãy viết chương trình để tách từ trong chuỗi và in từ đó.
public class String4 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        char kyTu = 0;
        String string=new String();
        System.out.println("nhap chuoi can xu ly: \n");
        string= scanner.nextLine();
        for (int i=0;i<string.length();i++) {
            kyTu = string.charAt(i);

            if (Character.isSpaceChar(kyTu)) {
                System.out.println();
            } else {
                System.out.print(kyTu);
            }
        }
    }
}
