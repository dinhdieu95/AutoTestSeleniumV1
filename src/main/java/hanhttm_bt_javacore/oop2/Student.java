package hanhttm_bt_javacore.oop2;

public class Student extends Person{
    private int id;
    private double grade;
    public Student(){}

    public Student(String name, int age, String gender, int id, double grade) {
        super(name, age, gender);
        this.id = id;
        this.grade = grade;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("\n id: " + id);
        System.out.println("\n grade: " + grade);
    }
}
