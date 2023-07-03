package hanhttm_bt_javacore.Oop15Shape;

abstract class Shape {
    abstract void calculateArea(int a, int b, int c);
}
class Retangle extends Shape {
    @Override
    void calculateArea(int a, int b, int c) {
        int sum=a+b+c;
        System.out.println("Retangle area:"+ sum);
    }


    public static void main(String[] args) {
        Retangle retangle = new Retangle();
        retangle.calculateArea(1,2,3);

    }
}