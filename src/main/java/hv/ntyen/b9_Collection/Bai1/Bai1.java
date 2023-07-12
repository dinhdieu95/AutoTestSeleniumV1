package hv.ntyen.b9_Collection.Bai1;

import java.util.List;

public class Bai1 {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        Student student1 = new Student(1, "A", 18);
        studentManagement.addStudent(student1);
        Student student2 = new Student(2,"B",20);
        studentManagement.addStudent(student2);
        Student student3 = new Student(3,"C",23);
        studentManagement.addStudent(student3);
        List<Student> studentList = studentManagement.getAllStudents();
        for (Student student:studentList){
            System.out.println("ID: " +student.getId() + ", Name: " +student.getName()+ ", Age: " +student.getAge());
        }
        double averageAge =         studentManagement.getAverageAge();
        System.out.println("Tuổi trung bình của sinh viên là: " +averageAge);
        Student studentById = studentManagement.getStudentById(3);
        System.out.println("ID: " +studentById.getId() + ", Name: " +studentById.getName()+ ", Age: " +studentById.getAge());
        studentManagement.removeStudent(2);
    }

}
