package hv.ntyen.b6_DaHinh_TruuTuong;

import hv.ntyen.b5_KeThua_DongGoi.Bai5_Car;

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

        System.out.println("---Bài 7------------------------------ ");
        System.out.println("Thông tin xe :");
        Car car = new Car("Thai Lan", "M20A-FKS", 2023, 1100000000d);
        System.out.println("make: " +car.getMake());
        System.out.println("model: " +car.getModel());
        System.out.println("year: " +car.getYear());
        System.out.println("price: " +car.getPrice());

        System.out.println("---Bài 8-9------------------------------ ");
        Employee e = new Employee("Yến", 18, "Nữ", 5000000, "A001");
        System.out.println("Thông tin Employee: ");
        e.displayInfo();

        System.out.println("---Bài 10------------------------------ ");
        e.increaseSalary();

        System.out.println("---Bài 11------------------------------ ");
        Dog d = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        d.makeSound();
        cat.makeSound();
        cow.makeSound();

        System.out.println("---Bài 12------------------------------ ");
        System.out.println("calculateArea(): " +r.calculateArea());
        System.out.println("calculateArea(int Side): "+r.calculateArea(10));
        System.out.println("calculateArea(int with, int length): " +r.calculateArea(5,10));

        System.out.println("---Bài 13------------------------------ ");
        Manager manager = new Manager("Yến", "Nữ", 18);
        Engineer engineer = new Engineer("Yến", "Nữ", 18);
        manager.chamCong();
        manager.lamViec();
        engineer.chamCong();
        engineer.lamViec();
        System.out.println("---Bài 14------------------------------ ");
        HighSchoolStudent highSchoolStudent = new HighSchoolStudent();
        CollegeStudent collegeStudent = new CollegeStudent();
        highSchoolStudent.goToSchool();
        collegeStudent.goToSchool();
        System.out.println("---Bài 15------------------------------ ");
        ImmutablePerson immutablePerson = new ImmutablePerson("Yến", 18);
        System.out.println("immutablePerson.getName: "+immutablePerson.getName());
        System.out.println("immutablePerson.getAge: "+immutablePerson.getAge());
        System.out.println("---Bài 16------------------------------ ");
        CircleExtendsShape circleExtendsShape = new CircleExtendsShape(10d);
        RectangleExtendsShape rectangleExtendsShape = new RectangleExtendsShape(10, 15);
        System.out.println("diện tích hình tròn bán kính = 10: " +circleExtendsShape.calculateAreaImpl());
        System.out.println("diện tích hình chữ nhật 10x15: " +rectangleExtendsShape.calculateAreaImpl());
    }
}
