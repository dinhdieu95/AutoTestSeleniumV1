package hanhttm_bt_javacore.oopsP2.Bai1;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void displayInfo(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("gender: " + gender);
    }

    public static void main(String[] args) {
        Person person1 = new Person("aaa",20,"nam");
        Person person2 = new Person("bbb",30,"nu");
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        for(Person person:personList){
            person.displayInfo();
        }
    }
}