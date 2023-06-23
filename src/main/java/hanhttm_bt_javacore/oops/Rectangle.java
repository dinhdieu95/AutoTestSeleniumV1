package hanhttm_bt_javacore.oops;

//Cho trước lớp Rectangle có các thuộc tính: width: double, height: double.
// Viết các getter, setter và constructor cho lớp Rectangle.
public class Rectangle {
    private double width;
    private double height;
//    public Rectangle(double width,double height){
//        super();
//        this.width=width;
//        this.height=height;
//    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
}
