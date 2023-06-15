package giaibai.b1;

import java.io.IOException;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        try {
            System.out.print("Nhập số nguyên a: ");
            a = scanner.nextInt();
//            System.out.print("Nhập số nguyên b: ");   // - comment ham rao khong cho he thong chay
//            b = scanner.nextInt();
//            System.out.println("Ket qua: " + xuLy(a, b));
//            System.out.println("Ket qua kiem tra so chia het: " + checkSoChiaHet(a));
            System.out.println("Ket qua kiem tra phan du : " + layPhanDu(a));
//            a += 2 ;
//            System.out.println("ket qua " + a);
        }catch (Exception e){
            System.out.println("Tiep tuc ");

        }





    }
    public static int xuLy(int a, int b) {
//        if(a > b && a < 15 ){
//            return a + b;
//        }
//        if  (a < 18 || b > 20){
//            return a-b ;
//        }
        a =  a -- ;
        if (a > 20){
            return a;
        }else if(a < 15){
            return 1;
        }
        else{
            return 0;
        }

    }

    public static boolean checkSoChiaHet(int a ){
        if(a % 3 == 0 ){
            return true;
        }
        return false;
    }
    public static float layPhanDu(int a ){

        return a % 3;
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
}
