//Cho trước lớp Employee có các thuộc tính:name: String,age: int,salary: double. Viết các getter, setter và constructor cho lớp Employee.
package hv.ntyen.b5_KeThua_DongGoi;

public class Bai1_Employee {
    private String name;
    private int age;
    private double salary;
    public Bai1_Employee (String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
