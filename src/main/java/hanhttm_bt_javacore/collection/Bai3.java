package hanhttm_bt_javacore.collection;

import java.util.Map;

public class Bai3 {
    public static void main(String[] args) {
        StudentMap studentMap = new StudentMap();
        Student student1 = new Student(1,"aa",30);
        studentMap.addStudent(student1);
        Student student2 = new Student(5,"bb",20);
        studentMap.addStudent(student2);
        Student student3 = new Student(3,"bb",40);


        studentMap.addStudent(student3);

        Student getStudent = studentMap.getStudentById(2);
        getStudent.printStudent();
        //ds sv
        Map<Integer,Student> studentMap1 = studentMap.getAllStudents();
        for(Student student:studentMap1.values()){
            student.printStudent();
        }
    }
}
