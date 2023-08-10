package learnjava.run.db.spring;

import learnjava.database.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        // Khởi tạo và cấu hình context của Spring
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        // Lấy bean EmployeeRepository từ context
        EmployeeService employeeRepository = context.getBean(EmployeeService.class);

        // Gọi vào phương thức getAllEmployees()
        List<Employee> employees = employeeRepository.getAllEmployees();

        // In thông tin về các Employee
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        // Đóng context
        context.close();
    }
}
