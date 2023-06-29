package dienpt.oop;

import java.util.Scanner;

public class myBankAcount {
    private double blance;

    public myBankAcount(double blance) {
        this.blance = blance;
    }

    public double getBlance() {
        return blance;
    }

    public void setBlance(double blance) {
        this.blance = blance;
    }
    public void deposit(){
        Scanner deposit = new Scanner(System.in);
        System.out.print("So tien gui la: " );
        double i = deposit.nextDouble();
        System.out.println("Bien dong so du TK: "  + (this.blance + i));
    }
    public void withdraw(){
        Scanner withdraw = new Scanner(System.in);
        System.out.print("So tien rut la: " );
        double a = withdraw.nextDouble();
        System.out.println("Bien dong so du TK: "  + (this.blance - a));
    }

    public static void main(String[] args) {
        myBankAcount balance = new myBankAcount(340000000);
        balance.deposit();
        balance.withdraw();
    }
}
