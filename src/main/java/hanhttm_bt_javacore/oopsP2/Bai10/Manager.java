package hanhttm_bt_javacore.oopsP2.Bai10;

public class Manager extends Employee {
    private double salary;
    public Manager(int id, String name, double salary) {
        super(id, name, salary);
    }
    public void increaseSalary(){
        this.salary=salary*2;
    }
}
