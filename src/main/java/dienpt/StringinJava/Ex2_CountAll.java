package dienpt.StringinJava;

import java.util.Scanner;

public class  Ex2_CountAll {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập vào chuỗi : ");
        String str=input.nextLine();
        int letterCount=0;
        int digitCount=0;
        for(int i = 0;i < str.length();i++){
            if(Character.isLetter(str.charAt(i))) {
                // Dem so luong ky tu la chu
                letterCount++;
            }
            else if(Character.isDigit(str.charAt(i))) {
                // Dem so luong ký tu la số
                digitCount++;
            }
        }
        System.out.println("Tổng So ky tu trong chuỗi là : " + str.length());
        System.out.println("So ky tu chữ  trong chuỗi là : " + letterCount);
        System.out.println("So chu so: " + digitCount);

    }
}
