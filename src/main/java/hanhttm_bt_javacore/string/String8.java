package hanhttm_bt_javacore.string;

import java.util.Scanner;

public class String8 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String st = new String();
        System.out.println("nhap chuoi can xu ly: \n");
        st = scanner.nextLine();
        numberCheck(st);
    }
    public static void numberCheck(String str){
        String reg="^\\d+$";
        if (str.matches(reg)){
            System.out.println("chuoi so nguyen");
        }
        else System.out.println("chuoi khong la so nguyen");
    }
}
