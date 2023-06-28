package hvduc.buoi7.bai12;

public class Rectangle {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
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

    public float caculateArea(){
        return width*height;
    }
    public  float caculateArea(float slide){
        return slide*slide;
    }
    public float caculateArea(float width,float height){
        return width*height;
    }
}
