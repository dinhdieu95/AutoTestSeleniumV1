//8. Viết một lớp Employee có các thuộc tính name, age, salary và id.
//9. Viết phương thức displayInfo() để hiển thị thông tin của nhân viên.
package hv.ntyen.b6_DaHinh_TruuTuong;

public class Employee extends Person{
    double salary;
    String id;

    public Employee(String name, int age, String gender, double salary, String id) {
        super(name, age, gender);
        this.salary = salary;
        this.id = id;
    }
    public double getSalary(){return salary;}
    public String getId(){return id;}
    public  void setSalary(double salary){this.salary = salary;}
    public void setId(String id){this.id = id;}
    public void displayInfo() {
        super.displayInfo();
        System.out.println("id: " + this.id);
        System.out.println("salary: " + this.salary);
    }
    public void increaseSalary(){
        double tyLeTangLuong=0.2;
        this.salary += tyLeTangLuong*salary;
        System.out.println("Bạn vừa được tăng lương: " + tyLeTangLuong*(salary/1.2) + ". Lương hiện tại của bạn là: " +this.salary);
    }
}
