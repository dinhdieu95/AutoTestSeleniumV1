package hv.ntyen.b6_DaHinh_TruuTuong;

public class RectangleExtendsShape extends Shape{
    private final double width;
    private final double height;

    public RectangleExtendsShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    protected double calculateAreaImpl() {
        return width*height;
    }
}
