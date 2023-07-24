
package hvduc.buoi5;

        import java.util.Scanner;

public class Bai1 {
    public static void main(String args[]) {
        System.out.println("Nhập chuỗi: ");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println("Chuỗi đảo ngược: ");
        String reverse = new StringBuffer(st).reverse().toString();
        System.out.println(reverse);
    }

}