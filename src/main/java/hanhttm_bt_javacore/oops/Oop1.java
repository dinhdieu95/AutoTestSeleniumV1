package hanhttm_bt_javacore.oops;

//Cho trước lớp Employee có các thuộc tính:name: String,age: int,salary: double.
//Viết các getter, setter và constructor cho lớp Employee.
public class Oop1 {
    public static void main(String[] args){
    Employee e =new Employee(1,"aa",30,50000);
        System.out.println("id: " + e.getId());
        System.out.println("name: " + e.getName());
        System.out.println("age: " + e.getAge());
        System.out.println("salary: " + e.getSalary());
    }
}
