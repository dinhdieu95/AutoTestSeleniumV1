package run;

import dto.CalculateKT;

public class MyCalculationKT extends CalculateKT {
    public void phepNhan(int a, int b) {
        c = a * b;
        System.out.println("Tích 2 số = " + c);
    }

    public void phepLuyThua(int a, int b) {
        c = (int) Math.pow(a, b);
        System.out.println(a + "^" + b + " = " + c);
    }

    public static void main(String[] args) {
        int a = 12, b = 2;
        MyCalculationKT myCalculation = new MyCalculationKT();
        myCalculation.phepCong(a, b);
        myCalculation.phepTru(a, b);
        myCalculation.phepNhan(a, b);
        myCalculation.phepLuyThua(a, b);
    }
}
