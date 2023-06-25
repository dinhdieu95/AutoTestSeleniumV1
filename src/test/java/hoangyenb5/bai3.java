package hoangyenb5;

import java.util.ArrayList;

public class bai3 {
    private String name;
    private int age;
    private String id;
    private ArrayList<String> courses;

    public bai3(String name, int age, String id, ArrayList<String> courses) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }
}
