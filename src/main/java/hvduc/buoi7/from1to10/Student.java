package hvduc.buoi7.from1to10;

public class Student extends Person{
    public Student(String name, int age, String gender) {
        super(name, age, gender);
    }

    private int id;
    private float grade;

    public Student() {

    }

    void displayInfo(){
        super.display();
        System.out.println("Student: " + id + ' ' + grade);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
