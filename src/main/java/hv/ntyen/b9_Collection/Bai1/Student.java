package hv.ntyen.b9_Collection.Bai1;

public class Student {
    private int id, age;
    private String name;
    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId(){return id;}
    public String getName(){return name;}
    public int getAge(){return age;}
    public void setId(int id){this.id = id;}
    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
}
