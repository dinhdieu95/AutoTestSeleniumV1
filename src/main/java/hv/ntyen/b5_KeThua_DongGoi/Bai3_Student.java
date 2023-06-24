//Cho trước lớp Student có các thuộc tính: name: String, age: int, id: String, courses: ArrayList<String>. Viết các getter, setter và constructor cho lớp Student.
package hv.ntyen.b5_KeThua_DongGoi;

import java.util.ArrayList;

public class Bai3_Student {
    private String name, id;
    private int age;
    private ArrayList<String> courses;
    public Bai3_Student(String name, int age, ArrayList<String> courses){
        this.name = name;
        this.age = age;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<String> getSalary() {
        return courses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(ArrayList courses) {
        this.courses = courses;
    }
}
