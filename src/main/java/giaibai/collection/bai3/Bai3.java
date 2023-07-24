package giaibai.collection.bai3;

import java.util.Map;

public class Bai3 {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();

        // Thêm sinh viên
        Student student1 = new Student(1, "John", 85);
        studentManagement.addStudent(student1);

        Student student2 = new Student(2, "Jane", 95);
        studentManagement.addStudent(student2);

        Student student3 = new Student(3, "Alice", 75);
        studentManagement.addStudent(student3);

        // Lấy thông tin sinh viên
        Student retrievedStudent = studentManagement.getStudentById(2);
        System.out.println("ID: " + retrievedStudent.getId() + ", Name: " + retrievedStudent.getName() + ", Score: " + retrievedStudent.getScore());

        // Xóa sinh viên
        studentManagement.removeStudent(1);

        // Lấy danh sách sinh viên
        Map<Integer, Student> studentMap = studentManagement.getAllStudents();
        for (Student student : studentMap.values()) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Score: " + student.getScore());
        }
    }
}
