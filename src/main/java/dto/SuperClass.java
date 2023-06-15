package dto;

public class SuperClass {// lớp cha
    protected int number = 10;

    public void hienThi() {
        System.out.println("Đây là phương thức hienThi() của lớp cha");
    }
    public SuperClass(int number) {
        System.out.println("Đây là hàm tạo có đối số của lớp Superclass, giá trị"
                + " biến number = " + number);
    }
}
