package learnjava.run;

import learnjava.dto.SuperClass;

public class SubClassKTTest extends SuperClass {
    public SubClassKTTest(int number) {
        super(number);
    }
    protected static int number = 20;

    public void hienThi() {
        System.out.println("Đây là phương thức hienThi() của lớp con");
    }

    public void subclassMethod() {
        SubClassKTTest subclass = new SubClassKTTest(number);

        // gọi phương thức hienThi() của lớp cha
        // sử dụng từ khóa super()
        super.hienThi();

        // gọi phương thức hienThi() của lớp con
        subclass.hienThi();

        // hiển thị giá trị biến number của lớp cha
        System.out.println("Giá trị biến number của lớp cha = " + super.number);

        // hiển thị giá trị biến number của lớp con
        System.out.println("Giá trị biến number của lớp con = " + subclass.number);
    }
    public static void main(String[] args) {
        SubClassKTTest objSubclass = new SubClassKTTest(number);
        objSubclass.subclassMethod();
    }
}
