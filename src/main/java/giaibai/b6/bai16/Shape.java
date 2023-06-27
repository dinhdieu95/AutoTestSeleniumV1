package giaibai.b6.bai16;

abstract class Shape {
    public final void calculateArea() {
        double area = calculateAreaImpl();
        System.out.println("Area: " + area);
    }

    protected abstract double calculateAreaImpl();
}