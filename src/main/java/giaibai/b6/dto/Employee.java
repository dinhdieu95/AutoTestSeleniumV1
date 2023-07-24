package giaibai.b6.dto;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private int id;

    public Employee(String name, int age, double salary, int id) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.id = id;
//        this.getAge();
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("ID: " + id);
    }

    public void increaseSalary(double percentage) {
        salary += salary * (percentage / 100);
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
