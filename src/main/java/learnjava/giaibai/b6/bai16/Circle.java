package learnjava.giaibai.b6.bai16;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    protected double calculateAreaImpl() {
        return Math.PI * radius * radius;
    }
}