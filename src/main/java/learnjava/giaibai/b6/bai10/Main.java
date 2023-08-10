package learnjava.giaibai.b6.bai10;

public class Main {
    public static void main(String[] args) {
        Engineer dev = new Engineer("John", 25, 25000);
        Manager manager = new Manager("Hanh", 33, 50000);
        dev.work();
        manager.work();

    }
}
