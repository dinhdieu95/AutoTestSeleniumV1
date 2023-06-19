package hanhttm_bt_javacore.string;

import java.util.Scanner;

//Cho một chuỗi bất kỳ, hãy viết chương trình để kiểm tra xem chuỗi đó có phải là chuỗi đối xứng hay không
public class String6 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String string, reverseString=new String();
        System.out.println("nhap chuoi can xu ly: \n");
        string= scanner.nextLine();
        int length=string.length();
        for (int i=length-1;i>=0;i--)
        {
            reverseString=reverseString+string.charAt(i);
        }
        if (string.equals(reverseString)) {
            System.out.println("day la chuoi doi xung");
        }
        else {
            System.out.println("day KHONG la chuoi doi xung");
        }
    }
}
