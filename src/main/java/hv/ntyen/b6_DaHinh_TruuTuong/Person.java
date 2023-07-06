//1. Viết một lớp Person có các thuộc tính name, age và gender. 2. Viết phương thức displayInfo() để hiển thị thông tin của đối tượng.
package hv.ntyen.b6_DaHinh_TruuTuong;

public class Person {
    String name, gender;
    int age;
    public  Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName(){return name;}
    public int getAge(){return age;}
    public  String getGender(){return gender;}
    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
    public void setGender(String gender){this.gender = gender;}
    public void displayInfo(){
        System.out.println("name: " +getName());
        System.out.println("age: "+getAge());
        System.out.println("gender: " +getGender());

    }
}
