package hvduc.buoi7.bai16;

public class Rectangle extends Shape{
    private float width;
    private float height;
    public float getArea(){
        return width*height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public void caculateArea() {
        System.out.println("Diện tích hcn là: " + getArea());
    }
}
