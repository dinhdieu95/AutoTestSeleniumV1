package learnjava.giaibai.b6.bai2;

import learnjava.giaibai.b6.bai1.Person;

public class Student extends Person {
    private int id; // private - access modifi
    private String grade;

    public String season; // default



    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Student(String name, int age, String gender, int id, String grade) { // hàm khởi tạo dữ liệu
        super(name, age, gender);// supper thâm chiếu hàm khởi tạo của lớp cha
        this.id = id;
        this.grade = grade;
    }

    @Override // ghi đè đa hình
    public void displayInfo() {
        super.displayInfo();// tên, tuổi,giới tính => kế thừa từ lớp cha
        System.out.println("Student ID: " + id);
        System.out.println("Grade: " + grade);
        System.out.println("Seasion: "+ season);
    }

    public static void main(String[] args) {
        Student student1 = new Student("John Smith", 18, "Male", 12345, "A");
        student1.mobile = "09435782";// truy cập trực tiếp
//        student1.a
        student1.displayInfo();
    }
}
