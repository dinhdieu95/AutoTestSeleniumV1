package dienpt.oop;

public class Employee {
    private int id ;
    private String name;
    private int age ;
    private double slary;

    //Contructor co truyen tham so
    public Employee(int id, String name, int age, double slary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.slary = slary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSlary() {
        return slary;
    }

    public void setSlary(double slary) {
        this.slary = slary;
    }
    public void displayInfo(){
        System.out.println("Thong tin nhan vien co ma NV la : "+ this.id);
        System.out.println("Ten nhan vien la : "+ this.name + "       Tuoi: " + this.age);
        System.out.println("Co thong tin luong hang thang : "  + this.slary);

    }
    public void increaseSalary(){
        System.out.println("luong sau khi tang cua nv = " + (this.slary*0.3 + this.slary));
    }

    public static void main(String[] args) {
        Employee nhanvien = new Employee(02213 , "DienPham", 28, 200000);
        nhanvien.displayInfo();
        nhanvien.increaseSalary();
    }
}
