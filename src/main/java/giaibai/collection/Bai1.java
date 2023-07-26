package giaibai.collection;

import java.util.List;

public class Bai1 {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();

        // Thêm sinh viên
        Student student1 = new Student(1, "John", 20);
        studentManagement.addStudent(student1);

        Student student2 = new Student(2, "Jane", 22);
        studentManagement.addStudent(student2);

        // Lấy thông tin sinh viên
        Student retrievedStudent = studentManagement.getStudentById(1);
        System.out.println("ID: " + retrievedStudent.getId() + ", Name: " + retrievedStudent.getName() + ", Age: " + retrievedStudent.getAge());

        // Xóa sinh viên
        studentManagement.removeStudent(2);

        // Lấy danh sách sinh viên
        List<Student> studentList = studentManagement.getAllStudents();
        for (Student student : studentList) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
        }

        // Tính tuổi trung bình
        double averageAge = studentManagement.getAverageAge();
        System.out.println("Average Age: " + averageAge);
    }
}
