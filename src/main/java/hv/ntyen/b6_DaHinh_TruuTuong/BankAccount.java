//6. Viết một lớp BankAccount có thuộc tính balance và các phương thức deposit() và withdraw() để thực hiện các giao dịch gửi và rút tiền.
package hv.ntyen.b6_DaHinh_TruuTuong;

import java.util.Scanner;

public class BankAccount {
    long balance;
    Scanner sc = new Scanner(System.in);
    public BankAccount(long balance){
        this.balance = balance;
    }
    public long getBalance(){return balance;}
    public void setBalance(long balance){this.balance = balance;}
    public double deposit(){
        double nap;
        System.out.print("Nhập số tiền cần nạp: ");
        nap = sc.nextDouble();
        if (nap >= 0) {
            balance += nap;
            System.out.println("bạn vừa nạp " + nap + " vào tài khoản.Số dư hiện tại là: " +balance);
        } else {//ngược lại nếu số tiền nộp vào bé hơn 0 thì không hợp lệ
            System.out.println("Số tiền nạp vào không hợp lệ!");
        }
        return nap;
    }
    public double withdraw() {
        double rut;
        System.out.print("Nhập số tiền bạn cần rút: ");
        rut = sc.nextDouble();
        //nếu số tiền rút bé hơn hoặc bằng số tiền còn trong tài khoản
        if (rut <= balance) {
            balance -= rut;
            System.out.println("Bạn vừa rút " + rut + "Đ từ tài khoản. Số dư hiện tại là: " +balance);
        } else {//ngược lại nếu số tiền rút lớn hơn số tiền có trong tài khoản thì không hợp lệ
            System.out.println("Số tiền muốn rút không hợp lệ!");
            return withdraw();
        }
        return rut;
    }

}
