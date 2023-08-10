package learnjava.giaibai.b6.bai10;

public class Manager extends Employee {

    public Manager(String name, int age, double salary) {

        super(name, age, salary);

    }

    @Override

    public void work() {

        System.out.println("Manager is managing the team.");

    }

}