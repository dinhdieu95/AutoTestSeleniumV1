package hv.ntyen.b6_DaHinh_TruuTuong;

public class Manager extends Abstract_Employee{
    public Manager(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void chamCong() {
        System.out.println("Manager chấm công");
    }

    @Override
    public void lamViec() {
        System.out.println("Manager làm việc");
    }
}
