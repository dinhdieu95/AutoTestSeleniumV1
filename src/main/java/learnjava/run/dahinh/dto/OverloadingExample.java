package learnjava.run.dahinh.dto;

public class OverloadingExample {
    public static int add(int a, int b) {

        return a + b;

    }
    public static int add(float a, float b) {

        return  (int)(a + b);

    }
    public double add(double a, double b) {

        return a + b;

    }
    public static int add(int a, int b, int c) {

        return a + b + c;

    }
//    public static void add(int a, int b, int c) {
//
//        System.out.println( a + b + c);;
//
//    }

}
