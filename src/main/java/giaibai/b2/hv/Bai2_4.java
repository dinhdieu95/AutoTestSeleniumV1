package giaibai.b2.hv;
import java.util.Scanner;

//Viết chương trình Java sử dụng vòng lặp while để tính tổng các số dương nhập từ bàn phím
public class Bai2_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao mot so nguyen thu nhat");
        int n1 = scanner.nextInt();
        System.out.println("nhap vao mot so nguyen thu hai");
        int n2 = scanner.nextInt();
        int tong=0;
        //n1>0 & n2>0  luôn = true
        //while ( diều kiện ) { hành động gì đó }
        while (n1>0 & n2>0){
            tong += n1 + n2;
            System.out.println("Tong cac so vua nhap la: " +tong); // chị để lệnh in trong này thì nó in ra được tổng nhưng chạy không dừng
//            break;
        }
        //System.out.println("Tong cac so vua nhap la: " +tong); //chị để lệnh in ở đây thì nó không thực trong vòng while??
    }
}