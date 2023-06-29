package run.dahinh;

import run.dahinh.dto.OverloadingExample;

public class DaHinhCompile {
    public static void main(String[] args) {

        OverloadingExample calculator = new OverloadingExample();

        int sum1 = calculator.add(2, 3); // Compiler sẽ gọi phương thức add(int, int)
        System.out.println(sum1);
        double sum2 = calculator.add(2.5, 3.7); // Compiler sẽ gọi phương thức add(double, double)
        System.out.println(sum2);
        int sum = calculator.add(1, 2, 3); // compiler sẽ gọi vào phương thức add( int a, int b, int c)
        System.out.println(sum);
    }
}
