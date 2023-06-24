//Cho trước lớp Rectangle có các thuộc tính: width: double, height: double. Viết các getter, setter và constructor cho lớp Rectangle.
package hv.ntyen.b5_KeThua_DongGoi;

public class Bai2_Rectangle {
    private double width,height ;
    public Bai2_Rectangle(double width, double height ){
        this.width = width;
        this.height = height;
    }

    public double getwidth() {
        return width;
    }

    public double getheight() {
        return height;
    }


    public void setwidth(double width) {
        this.width = width;
    }

    public void setheight(double height) {
        this.height = height;
    }


}
