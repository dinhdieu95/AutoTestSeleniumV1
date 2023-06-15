package giaibai.b2.hv;

import java.util.Scanner;

public class Bai2Duc { //Viết chương trình Java sử dụng vòng lặp while để tính tổng các số dương nhập từ bàn phím.

    public static void printResult(){
        String input;
        char option = 0;
        do{
            System.out.println("Nhập thứ bạn muốn để in ra: ");
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();
            System.out.println("Kết quả nè: " + input);
            System.out.println("Bạn muốn tiếp tục chứ? Y/N");
            option = sc.next().charAt(0);
            while (option != 'Y' && option != 'y' && option != 'n' && option != 'N') {
                System.out.println("Nhập lại lựa chọn ha: ");
                option = sc.next().charAt(0);
            }

        } while (option != 'N' && option != 'n');
        System.out.println("Thanks");
    }

    public static void main(String[] args) {
        printResult();
    }
}

