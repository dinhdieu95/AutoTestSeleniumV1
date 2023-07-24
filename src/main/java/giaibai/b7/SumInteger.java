package giaibai.b7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumInteger {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        boolean booleanInt=false;
        int a=-1;
        do{
            try{
                a=scanner.nextInt();
            }catch (Exception e){
                System.out.println("not integer");
                scanner.nextInt();
            }
        } while (a>10000); // chỗ này nhập số lớn hơn 0 chứ không phải 10000
        System.out.println("a: "+a);
        int b = scanner.nextInt();
        System.out.println("sum: "+sum(a,b));
    }
    public static int sum(int a, int b){
        return  a+ b;
    }

}