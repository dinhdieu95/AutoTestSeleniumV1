package giaibai.b6.bai1;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private String gender;

    protected String mobile;
    String address;

    public Person(String name, int age, String gender) { // khởi tạo dữ liệu
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayInfo() {
        System.out.println("Thông tin đối tương: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    public static void main(String[] args) {
        Person john = new Person("John Smith", 30, "Male");
        Person chiHanh = new Person("Hanh", 33, "female");
        ArrayList <Person> listObject = new ArrayList<>();
        listObject.add(john);
        listObject.add(chiHanh);
        System.out.println("Danh sách đối tượng: ");
        for(Person person : listObject){
            person.displayInfo();
        }
    }
}
