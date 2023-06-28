//4. Viết một lớp Rectangle có thuộc tính width và height. 5. 5. Viết phương thức getArea() để tính diện tích của hình chữ nhật.
package hv.ntyen.b6_DaHinh_TruuTuong;

public class Rectangle {
    private double width,height ;
    public Rectangle(double width, double height ){
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
    public void getArea(double width, double height){
        double area = width*height;
        System.out.println(area);
    }

}
