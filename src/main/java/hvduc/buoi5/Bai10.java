package hvduc.buoi5;

import java.util.Scanner;

public class Bai10 {
    public static void main(String args[]) {
        System.out.println("Nhập chuỗi: ");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println("Nhập ký tự: ");
        Character character = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < st.length();i++){
            if (st.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Số ký tự " +character+ " có trong chuỗi là: "+count);
    }
}
