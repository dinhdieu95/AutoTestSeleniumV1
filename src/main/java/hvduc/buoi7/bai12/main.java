package hvduc.buoi7.bai12;

public class main {
    public static void main(String args[]) {
        Rectangle rectangle = new Rectangle(3,5);
        System.out.println("Diện tích hcn: " + rectangle.caculateArea());
        System.out.println("Diện tích hình vuông: " + rectangle.caculateArea(13));
        System.out.println("Diện tích hình chữ nhật với độ dài cạnh là 3 và 5: " + rectangle.caculateArea(3,5));

    }
}
