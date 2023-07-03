package giaibai.b6;

import giaibai.b6.dto.Employee;

public class Bai7 {
    public static void main(String[] args) {
        Employee employee = new Employee("John Smith", 30, 50000.0, 12345); // khởi tao dữ liệu
        System.out.println("Thể hiện lương cũ: ");
        employee.displayInfo();
        employee.increaseSalary(10.0);
        System.out.println("Thể hiện lương mới: ");
        employee.displayInfo();

        employee.setName("John"); // cập nhâpj lại name của đối tượng
        employee.displayInfo();

        System.out.println("Tuoi cua nhan vien: " + employee.getAge());

//        employee.getAge() =>> lấy ra tuổi của đối tượng
    }
}
