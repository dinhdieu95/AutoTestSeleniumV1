package hv.ntyen.b6_DaHinh_TruuTuong;

public class Circle extends Rectangle {
    double radius;
    public Circle(double width, double height, double radius) {
        super(width, height);
        this.radius = radius;
    }
    public void getArea(){
        System.out.println("Diện tích hình tròn là: " +Math.PI*this.radius*this.radius);
    }
}
