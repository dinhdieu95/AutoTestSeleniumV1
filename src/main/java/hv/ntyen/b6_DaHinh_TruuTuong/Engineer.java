package hv.ntyen.b6_DaHinh_TruuTuong;

public class Engineer extends Abstract_Employee{
    public Engineer(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void chamCong() {
        System.out.println("Engineer chấm công");
    }

    @Override
    public void lamViec() {
        System.out.println("Engineer làm việc");
    }
}
