package hvduc.buoi7.bai13;

public class Engineer extends Employee {
    private String engineer = "Là kỹ sư";

    @Override
    public void displayInfo() {
        System.out.println(getName() + " " + getId() + " " + engineer);
    }
}
