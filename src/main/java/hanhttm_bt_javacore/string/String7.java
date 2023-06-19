package hanhttm_bt_javacore.string;

import java.util.Scanner;

// Cho một chuỗi bất kỳ, hãy viết chương trình để xoá các khoảng trắng ở đầu và cuối chuỗi.
public class String7 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String st=new String();
        System.out.println("nhap chuoi can xu ly: \n");
        st= scanner.nextLine();
        System.out.println("chuoi cat space dau cuoi la");
        System.out.println(st.trim());

    }

}
