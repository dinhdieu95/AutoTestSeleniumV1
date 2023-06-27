package giaibai.b6;

import giaibai.b6.dto.Employee;

public class Bai7 {
    public static void main(String[] args) {
        Employee employee = new Employee("John Smith", 30, 50000.0, 12345);
        employee.displayInfo();
        employee.increaseSalary(10.0);
        employee.displayInfo();
    }
}
