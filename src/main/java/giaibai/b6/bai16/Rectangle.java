package giaibai.b6.bai16;

class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    protected double calculateAreaImpl() {
        return width * height;
    }
}