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
    }
}
