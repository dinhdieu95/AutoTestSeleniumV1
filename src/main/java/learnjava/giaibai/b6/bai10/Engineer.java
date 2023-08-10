package learnjava.giaibai.b6.bai10;

public class Engineer extends Employee {

    public Engineer(String name, int age, double salary) {

        super(name, age, salary);

    }

    @Override

    public void work() {

        System.out.println("Engineer is coding and developing software.");

    }

}