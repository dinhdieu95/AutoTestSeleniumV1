package hvduc.buoi9.bai5;

import java.util.Scanner;

public class Unity {
    public int total(int a, int b){
        return a+b;
    }
    public boolean checkNum(double number){
        boolean check = true;
        if(Math.ceil(number) != Math.floor(number)) {
           check = false;
            System.out.println("Không phải số nguyên");
        }
        return check;
    }

    public boolean checklength(double length){
        boolean check = true;
        if(length > Integer.MAX_VALUE){
            check = false;
            System.out.println("Số quá dài");
        }else{
            System.out.println("Hợp lệ");
        }
        return check;
    }
    public void addNumber() {
        Scanner sc = new Scanner(System.in);
        double a = 0;
        double b = 0;
        try {
            System.out.println("Nhập số đầu tiên: ");
            a = sc.nextDouble();
            while (checkNum(a) != true || checklength(a) != true){
                System.out.println("Nhập lại nhé");
                a = sc.nextDouble();
            }
            System.out.println("Nhập số thứ 2: ");
            b = sc.nextDouble();
            while (checkNum(b) != true || checklength(b) != true){
                System.out.println("Nhập lại nhé");
                b = sc.nextDouble();
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Tổng 2 số là: " + total((int) a, (int) b));
        }
    }
}
