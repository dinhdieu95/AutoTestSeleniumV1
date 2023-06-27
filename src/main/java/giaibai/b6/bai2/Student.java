package giaibai.b6.bai2;

import giaibai.b6.bai1.Person;

public class Student extends Person {
    private int id;
    private String grade;

    public Student(String name, int age, String gender, int id, String grade) {
        super(name, age, gender);
        this.id = id;
        this.grade = grade;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + id);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Student student = new Student("John Smith", 18, "Male", 12345, "A");
        student.displayInfo();
    }
}
