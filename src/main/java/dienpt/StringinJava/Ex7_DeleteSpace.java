package dienpt.StringinJava;

import java.util.Scanner;

public class Ex7_DeleteSpace {
    public static void ChuoiNhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nNhập vào chuỗi cần kiểm tra: ");
        String input = sc.nextLine();
        System.out.println("Chuỗi ban đầu: " + input);
        input = input.trim();
        System.out.println("Chuỗi sau khi xóa khoảng trắng: " + input);
    }
    public static void main(String args[]) {
        ChuoiNhap();
    }
}
