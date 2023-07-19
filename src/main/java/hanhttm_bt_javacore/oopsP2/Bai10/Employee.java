package hanhttm_bt_javacore.oopsP2.Bai10;

public abstract class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }

    public abstract void increaseSalary();
}

