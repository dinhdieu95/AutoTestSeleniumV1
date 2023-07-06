package hv.ntyen.b6_DaHinh_TruuTuong;

public abstract class Shape {
    public final void calculateArea() {
        double area = calculateAreaImpl();
        System.out.println("Area: " + area);
    }

    protected abstract double calculateAreaImpl();
}
