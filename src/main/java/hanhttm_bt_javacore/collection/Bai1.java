package hanhttm_bt_javacore.collection;

import java.util.List;

public class Bai1 {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        Student student1 = new Student(1,"aa",30);
        studentManagement.addStudent(student1);
        Student student2 = new Student(2,"bb",40);
        studentManagement.addStudent(student2);
        //getStudentById
        Student getStudent = studentManagement.getStudentById(1);
        studentManagement.printStudent(getStudent);
        //get all
        System.out.println("get All");
        List<Student> newStudentList = studentManagement.getAllStudents();
        for (Student student:newStudentList){
          student.printStudent();
        }
        //tuoi trung binh
        double averageAge= studentManagement.getAverageAge();
        System.out.println(averageAge);

        //remove
        studentManagement.removeStudent(1);
        //get all
        System.out.println("get All 2");
        List<Student> newStudentList2 = studentManagement.getAllStudents();
        for (Student student:newStudentList2){
            student.printStudent();
        }
    }
}
