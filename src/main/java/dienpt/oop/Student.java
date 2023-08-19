package dienpt.oop;

public class Student extends Person{
    private int id;
    private double grade;

    public Student(int id, double grade) {
        this.id = id;
        this.grade = grade;
    }

    public Student(String name, int age, String gender, int id, double grade) {
        super(name, age, gender);
        this.id = id;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    private void dispPlayInfo(){
        System.out.println("Sinh vien co ten la  : " + this.getName() + "  tuoi la : " + this.getAge() + " gioi tinh :  " + this.getGender() +
                "   Co Masv la :   " + this.id + "   Diem trung binh mon   "  + this.grade );
    }

    public static void main(String[] args) {
        Student sinhvien = new Student(2275 , 9.5);
        sinhvien.setName("Pham Thi Dien");
        sinhvien.setAge(28);
        sinhvien.setGender("nu");
        sinhvien.dispPlayInfo();
    }

}
