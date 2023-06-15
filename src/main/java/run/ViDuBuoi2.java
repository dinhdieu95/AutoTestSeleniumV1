package run;

import dto.KhachHang;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ViDuBuoi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập so a: ");
////        String a = scanner.next();
//        int a = scanner.nextInt();
//        scanner.nextDouble();
//        scanner.nextFloat();
//        switch case
//        checkSwitch(a);

//        vong lap while
//        checkWhile(a);
//        checkDoWhile(a);

//        só sánh static
//        nonstatic
        KhachHang kh = new KhachHang("Dieu", 28);
        System.out.println("Nonstatic");
        System.out.println(kh.toString());
//       static
        kh("Dieu", 28);
//        khNonStatic("Dieu", 28);

    }

    public static void kh(String ten, int tuoi){
        System.out.println("Ham static: " + "Ten: " + ten + " và tuoi " + tuoi);
    }
    public  void khNonStatic(String ten, int tuoi){
        System.out.println("Ham static: " + "Ten: " + ten + " và tuoi " + tuoi);
    }

    public static void checkSwitch(String luaChon){
        switch (luaChon){
            case "Sach" :
                System.out.println("Danh sach sach ");
                break;
            case "Hoa" :
                System.out.println("Danh sach hoa ");
                break;
            case "But" :
                System.out.println("Danh sach But ");
                break;
            default:
                System.out.println("hang gia dung");
                break;
        }
    }

    public static void checkWhile(int a ){
        System.out.println("=======================================");
        System.out.println("Check vong lap while ");
        int tong = 0 ;
        while (a < 5){
            tong += a;// tong = 3  lan 2 tong = 3 + 4
            a = ++ a ;
            System.out.println(a);
        }
        System.out.println("So tong: " + tong);
    }

    public static void checkDoWhile(int a ){

        System.out.println("=======================================");
        System.out.println("Check vong lap do while ");
        int tong = 0 ;
        do{
                tong += a;// tong = 0 + 15
                a = ++ a ;
                System.out.println(a);
        }
        while (a < 5);
        System.out.println("So tong: " + tong);
    }


}
