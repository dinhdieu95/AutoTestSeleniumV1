package hv.ntyen.b6_DaHinh_TruuTuong;

public abstract class Abstract_Employee {
    String name, gender;
    int age;
    public Abstract_Employee(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public abstract void chamCong();
    public abstract void lamViec();
}
