package hvduc.buoi7.from1to10;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private int id;

    public void displayInfo(){
        System.out.println("Employee{" + "name='" + name + '\'' + ", age=" + age + ", salary=" + salary + ", id=" + id + '}');
    }
    public double increaseSalary(){
        return salary += salary*0.1;
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
