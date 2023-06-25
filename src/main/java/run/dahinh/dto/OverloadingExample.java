package run.dahinh.dto;

public class OverloadingExample {
    public static int add(int a, int b) {

        return a + b;

    }

    public static int add(int a, int b, int c) {

        return a + b + c;

    }
    public double add(double a, double b) {

        return a + b;

    }
}
