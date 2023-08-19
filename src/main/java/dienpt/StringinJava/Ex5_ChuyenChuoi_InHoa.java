package dienpt.StringinJava;

import java.util.Scanner;

public class Ex5_ChuyenChuoi_InHoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi cần in hoa: ");
        String message = sc.nextLine();

        String chuoiInHoa = message.toUpperCase();

        System.out.print("Chuỗi sau khi đổi:" + chuoiInHoa);

    }

}