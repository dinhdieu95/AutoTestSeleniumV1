package hanhttm_bt_javacore.oops;

//Cho trước lớp Employee có các thuộc tính:name: String,age: int,salary: double.
//Viết các getter, setter và constructor cho lớp Employee.
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    public Employee(int id, String name, int age, double salary){
        super();
        this.id=id;
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public int getId() {
        return id;
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

    public void setId(int id) {
        this.id = id;
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
