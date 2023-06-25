package run.dahinh;

import run.dahinh.dto.OverloadingExample;

public class DaHinhCompile {
    public static void main(String[] args) {

        OverloadingExample calculator = new OverloadingExample();

        int sum1 = calculator.add(2, 3); // Compiler sẽ gọi phương thức add(int, int)

        double sum2 = calculator.add(2.5, 3.7); // Compiler sẽ gọi phương thức add(double, double)

    }
}
