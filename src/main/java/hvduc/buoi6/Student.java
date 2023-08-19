package hvduc.buoi6;

import java.util.ArrayList;

public class Student {
    private String name;
    private  int age;
    private String id;
    private ArrayList<String> courses = new ArrayList<>();

    public Student(String name, int age, String id, ArrayList<String> courses) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }
}
