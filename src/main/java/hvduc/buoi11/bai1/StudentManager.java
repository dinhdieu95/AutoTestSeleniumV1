package hvduc.buoi11.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    ArrayList<Student> studentList = new ArrayList<>();
    public void addStudent(){
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin sinh viên");
        System.out.println("ID: ");
        String id = sc.nextLine();
        System.out.println("Họ tên: " );
        String name = sc.nextLine();
        System.out.println("Tuổi: ");
        int age = sc.nextInt();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        studentList.add(student);
    }
    public void removeStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id của sinh viên cần xóa: ");
        String studentId = sc.nextLine();
        for (Student id : studentList){
            if (studentId == id.getId()){
                System.out.println(id);
                studentList.remove(id);
                System.out.println("Xóa thành công");
            }
//            System.out.println(id.getName() + id.getId() + id.getAge());
        }
    }
}
