package hvduc.buoi7.bai13;

public class main {
    public static void main(String args[]) {
        Manager m = new Manager();
        Engineer e = new Engineer();
        m.setName("Tú");
        m.setId(1);
        e.setName("Uyên");
        e.setId(2);
        m.displayInfo();
        e.displayInfo();
    }
}
