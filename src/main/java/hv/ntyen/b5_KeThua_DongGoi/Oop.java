package hv.ntyen.b5_KeThua_DongGoi;

public class Oop {
    public static void main(String[] args) {
        System.out.println("1. Thông tin nhân viên:");
        Bai1_Employee employee = new Bai1_Employee("Yen", 18, 5000000d);
        System.out.println("Tên: " +employee.getName());
        System.out.println("Tuổi: "+employee.getAge());
        System.out.println("Lương: "+employee.getSalary());

        System.out.println("-----------------------------------------------------");
        System.out.println("2. Thông tin hình chữ nhật:");
        Bai2_Rectangle rectangle = new Bai2_Rectangle(20, 50);
        System.out.println("Chiều rộng: " +rectangle.getwidth());
        System.out.println("Chiều cao: "+rectangle.getheight());

        System.out.println("-----------------------------------------------------");
        System.out.println("3. Thông tin sinh viên :");

        System.out.println("-----------------------------------------------------");
        System.out.println("4. Thông tin sách :");
        Bai4_Book book = new Bai4_Book("Think in Java", "Bruce Eckel", 1998,500000d);
        System.out.println("Tên sách: "+book.getTitle());
        System.out.println("Tác giả: " +book.getAuthor());
        System.out.println("Năm xuất bản: " +book.getYear());
        System.out.println("Giá: " +book.getPrice());

        System.out.println("-----------------------------------------------------");
        System.out.println("5. Thông tin xe :");
        Bai5_Car car = new Bai5_Car("Thai Lan", "M20A-FKS", 2023, 1100000000d);
        System.out.println("make: " +car.getMake());
        System.out.println("model: " +car.getModel());
        System.out.println("year: " +car.getYear());
        System.out.println("price: " +car.getPrice());

    }
}
