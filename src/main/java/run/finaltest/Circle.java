package run.finaltest;

public class Circle {
    private static final double PI = 3.14159;

    private final int radius;

    public Circle(int radius) {

        this.radius = radius;

    }

    public double calculateArea() {

        return PI * radius * radius;

    }

    public static void main(String[] args) {

        Circle circle = new Circle(5);
//        PI = 3.5;

        System.out.println("Area: " + circle.calculateArea()); // Kết quả: 78.53975

    }
}
