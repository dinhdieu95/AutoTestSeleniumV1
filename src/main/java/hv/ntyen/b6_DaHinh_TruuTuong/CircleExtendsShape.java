package hv.ntyen.b6_DaHinh_TruuTuong;

public class CircleExtendsShape extends Shape{
    private final double radius;

    public CircleExtendsShape(double radius) {
        this.radius = radius;
    }
    @Override
    protected double calculateAreaImpl() {
        return Math.PI * radius * radius;
    }
}
