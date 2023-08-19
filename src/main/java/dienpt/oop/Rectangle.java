package dienpt.oop;

public class Rectangle {
    private int canh1;
    private int canh2;

    public Rectangle(int canh1, int canh2) {
        this.canh1 = canh1;
        this.canh2 = canh2;
    }

    public int getCanh1() {
        return canh1;
    }

    public void setCanh1(int canh1) {
        this.canh1 = canh1;
    }

    public int getCanh2() {
        return canh2;
    }

    public void setCanh2(int canh2) {
        this.canh2 = canh2;
    }
    public void getArea(){
        System.out.println("Dien tich hinh chu la : " + (this.canh1*this.canh2));
    }
    public void calculateArea(int side){
        System.out.println("Dien tich hinh vuong : " + (side*side) );
    }
    public void calculateArea(int length, int width) {
        System.out.println("Dien tich hinh chu nhat : " + (length*width));
    }

    public static void main(String[] args) {
        Rectangle dientich = new Rectangle(12,6);

        dientich.getArea();

        dientich.calculateArea(5);
        dientich.calculateArea(5,7);
    }
}
