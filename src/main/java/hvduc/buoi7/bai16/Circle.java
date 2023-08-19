package hvduc.buoi7.bai16;

public class Circle extends Shape{
    private float radius;
    public float getArea(){
        return (float) (Math.PI*radius*radius);
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void caculateArea() {
        System.out.println("Diện tích hình tròn là: " + getArea());
    }
}
