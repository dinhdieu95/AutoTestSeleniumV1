package hvduc.buoi5;

import java.util.Scanner;

public class Bai8 {
    public static void main(String args[]) {
        System.out.println("Nhập chuỗi: ");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        boolean checkNum = true;
        for (int i = 0; i < st.length(); i++) {
            if (!Character.isDigit(st.charAt(i))) {
                checkNum = false;
                break;
            }
        }
            if(checkNum && Integer.parseInt(st) > 0){
                System.out.println("Đây là số nguyên dương.");
            } else {
                System.out.println("Đây không là số nguyên dương.");
            }
            sc.close();
    }
}
