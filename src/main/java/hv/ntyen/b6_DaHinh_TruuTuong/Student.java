//3. Viết một lớp Student kế thừa từ lớp Person, có thêm thuộc tính id và grade. Viết phương thức displayInfo() để hiển thị thông tin của đối tượng, bao gồm thông tin về lớp Student.
package hv.ntyen.b6_DaHinh_TruuTuong;

public class Student extends Person {
    private String id, grade;

    public Student(String name, int age, String gender, String id, String grade) {
        super(name, age, gender);
        this.id = id;
        this.grade = grade;
    }
    public String getId(){return id;}
    public String getGrade(){return grade;}
    public void setId(String id){this.id = id;}
    public void setGrade(String grade){this.grade = grade;}
    public void displayInfo(){
        super.displayInfo();
        System.out.println("id: " +this.id);
        System.out.println("grade: " +this.grade);
    }

}
