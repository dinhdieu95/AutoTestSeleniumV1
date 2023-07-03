package giaibai.b6.bai1;

import giaibai.b6.bai2.Student;

public class TestAccess {
    public static void main(String[] args) {
        Student test = new Student("John Smith", 18, "Male", 12345, "A");
        System.out.println("Trước khi set lại thông tin: ");
        test.displayInfo();

        System.out.println("sau khi set lại thông tin: ");
        test.setGrade("A+");// truy cập gián tiếp
        test.season ="Seasion1"; // truy cập trực tiếp
        test.displayInfo();

        Person john = new Person("John Smith", 30, "Male");
        john.address = "Ha Noi";
    }
}
