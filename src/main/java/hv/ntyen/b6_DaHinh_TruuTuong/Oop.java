package hv.ntyen.b6_DaHinh_TruuTuong;

public class Oop {
    public static void main(String[] args) {
        System.out.println("---Bài 1-2------------------------------ ");
        Person p = new Person("Yến", 18, "Nữ");
        System.out.println("Thông tin Person: ");
        p.displayInfo();
        System.out.println("---Bài 3------------------------------ ");
        Student s = new Student("Yến", 18, "Nữ", "MD01", "A");
        System.out.println("Thông tin Student: ");
        s.displayInfo();
        System.out.println("---Bài 4------------------------------ ");
        Rectangle r = new Rectangle(2d, 5d);
        System.out.print("Diện tích hình chữ nhật là: ");
        r.getArea(2d, 5d);
        System.out.println("---Bài 5------------------------------ ");
        Circle c = new Circle(20d,30d, 40d);
        c.getArea();
        System.out.println("---Bài 6------------------------------ ");
        BankAccount b = new BankAccount(1000000000l);
        System.out.println("Số dư hiện tại trong tài khoản là: "+b.balance);
        b.deposit();
        b.withdraw();
    }
}
