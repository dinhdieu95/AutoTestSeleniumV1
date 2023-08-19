package dienpt.StringinJava;

import java.util.Scanner;

public class Ex3_SoSanhChuoi {
    public static void ChuoiCoSan(){
        String s1 = "Hello";
        String s2 = "HELLO";
        System.out.println("2 chuoi co phan biet hoa thuong: " + s1.equals(s2));
        System.out.println("2 chuoi ko phan biet hoa thuong: " + s1.equalsIgnoreCase(s2));
    }
    public static void ChuoiNhap(){
            String chuoi1, chuoi2;
            int result;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào chuỗi thứ nhất: ");
            chuoi1 = scanner.nextLine();
            System.out.println("Nhập vào chuỗi thứ hai: ");
            chuoi2 = scanner.nextLine();

            // equals -> So sanh phan biet hoa thuong
            if(chuoi1.equals(chuoi2)) {
                System.out.println("Hai chuoi giong nhau");
            } else {
                System.out.println("Hai chuoi khac nhau");
            }
        }
    public static void main(String args[]) {
        ChuoiCoSan();
        ChuoiNhap();

    }
}
