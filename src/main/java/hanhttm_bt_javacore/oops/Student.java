package hanhttm_bt_javacore.oops;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    private String id;
    private String name;
    private int age;
    private ArrayList<String> course;

    public Student(String id, String name, int age, ArrayList<String> course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

     public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<String> getCourse() {
        return course;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(ArrayList<String> course) {
        this.course = course;
    }
}
