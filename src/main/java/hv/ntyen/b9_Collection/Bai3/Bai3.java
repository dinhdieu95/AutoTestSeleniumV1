package hv.ntyen.b9_Collection.Bai3;

import java.util.Map;


public class Bai3 {
    public static void main(String[] args) {
        Student student1 = new Student(1, "A", 8);
        Student student2 = new Student(2, "B", 9);
        Student student3 = new Student(3, "C", 10);
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.addStudent(student1);
        studentManagement.addStudent(student2);
        studentManagement.addStudent(student3);
        System.out.println("Danh sách sinh viên: ");
        Map<Integer, Student> studentMap = studentManagement.getAllStudents();
        for (Student student : studentMap.values()) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Score: " + student.getScore());
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Thông tin sinh viên có Id = 1: ");
        Student studentById = studentManagement.getStudentById(2);
        System.out.println("ID: " + studentById.getId() + ", Name: " + studentById.getName() + ", Score: " + studentById.getScore());
        System.out.println("----------------------------------------------------");
        studentManagement.removeStudent(3);
        System.out.println("Xoá thành công sinh viên Id = 3");

    }
}
