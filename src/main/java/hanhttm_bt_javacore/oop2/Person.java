package hanhttm_bt_javacore.oop2;

public class Person {
    private String name;
    private int age;
    private String gender;

   public  Person(){

   }
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void displayInfo(){
        System.out.println("name: " + name);
        System.out.println("\nage: " + age);
        System.out.println("\ngender: " + gender);
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
