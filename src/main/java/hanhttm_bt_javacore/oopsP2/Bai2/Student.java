package hanhttm_bt_javacore.oopsP2.Bai2;

import hanhttm_bt_javacore.oopsP2.Bai1.Person;

public class Student extends Person {
    private int id;
    private String grade;

    public Student(String name, int age, String gender, int id, String grade) {
        super(name, age, gender);
        this.id=id;
        this.grade=grade;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("id: " + id);
        System.out.println("grade: " +grade);
    }

    public static void main(String[] args) {
        Student student = new Student("ccc", 40,"nam", 12, "A2");
        student.displayInfo();
    }
}
