package hv.ntyen.b3;

import java.util.ArrayList;
import java.util.Scanner;

//Viết chương trình Java sử dụng vòng lặp for để in ra tam giác Pascal với số hàng được nhập từ bàn phím.
public class Bai10 {
    static int pascal (int n){ //phương thức tính giá trị giai thừa
        int pc = 1;
        if (n == 0) return 1; // nếu số hàng của tam giác = 0 hặc 1 thì in ra giá trị =1
        else for (int i = 1; i<=n; i++) pc *=i;
        return pc;
    }
    static void hienThi(){ // phương thức để in ra màn hình
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hàng của tam giac pascal: ");
        n = sc.nextInt();
        System.out.println("in ra tam giac pascal:");
        for (int i = 0; i<=n; i++){
            for (int j =0; j<=i; j++)
                System.out.print((pascal(i)/(pascal(j)*pascal(i-j))) + "");
            System.out.println();
            }
        }
    public static void main(String[] args) {
        hienThi();
    }
}
