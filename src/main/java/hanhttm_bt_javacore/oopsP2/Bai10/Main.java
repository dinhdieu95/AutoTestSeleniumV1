package hanhttm_bt_javacore.oopsP2.Bai10;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(1,"a",1000);
        System.out.println("luong cu la: " + manager.getSalary());
        manager.increaseSalary();
        System.out.println("luong moi la: " + manager.getSalary());
    }
}
