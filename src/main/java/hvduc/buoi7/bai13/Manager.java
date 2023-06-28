package hvduc.buoi7.bai13;

public class Manager extends Employee{
    private String manager = "Là quản lý";

    @Override
    public void displayInfo() {
        System.out.println(getName() + getId() + manager);
    }
}
