package hvduc.buoi7.bai14;


public class Student {

    private int id;
    private float grade;
    private String name;

    public Student() {

    }

    void displayInfo(){
        System.out.println("Student: " + name + ' '+ id + ' ' + grade);
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

    public Student(int id, float grade, String name) {
        this.id = id;
        this.grade = grade;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

