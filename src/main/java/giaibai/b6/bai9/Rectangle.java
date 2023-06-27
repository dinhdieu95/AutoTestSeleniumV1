package giaibai.b6.bai9;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea() {
        return length * width;
    }

    public int calculateArea(int side) {
        return side * side;
    }

    public int calculateArea(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        int area1 = rectangle.calculateArea();
        System.out.println("Area of rectangle: " + area1);

        int side = 3;
        int area2 = rectangle.calculateArea(side);
        System.out.println("Area of square: " + area2);

        int length = 6;
        int width = 7;
        int area3 = rectangle.calculateArea(length, width);
        System.out.println("Area of rectangle with different length and width: " + area3);
    }
}
