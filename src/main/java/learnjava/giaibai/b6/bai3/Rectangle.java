package learnjava.giaibai.b6.bai3;
public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 7.0);
        double area = rectangle.getArea();
        System.out.println("Area of the rectangle: " + area);
    }
}

