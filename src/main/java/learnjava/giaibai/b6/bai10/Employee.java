package learnjava.giaibai.b6.bai10;

public abstract class Employee{
    private String name;

    private int age;

    private double salary;

    public Employee(String name, int age, double salary) {

        this.name = name;

        this.salary = salary;

    }

    public abstract void work();

// Getter và Setter

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
}
