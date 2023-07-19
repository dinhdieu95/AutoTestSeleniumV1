package hanhttm_bt_javacore.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private int mobile;

    public Student(int id, String name, int mobile) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMobile() {
        return mobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile=" + mobile +
                '}';
    }

    public static void main(String[] args) throws IOException{

        String filePath = "student.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        Student student=new Student(1,"abc",0123);
        Student student1=new Student(2,"bb",0123);
       List<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(student);
        studentArrayList.add(student1);

        for(Student student2:studentArrayList) {
            String line =student2.toString();
            writer.write(line);
            writer.newLine();
        }
        System.out.println("Đã ghi danh sách học sinh vào file thành công!");
    }


    public static void writeFile(String fileName, Student student) throws IOException{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            String line =student.toString();
            writer.write(line);
            writer.newLine();
        } catch (IOException e){
            System.out.println("xay ra loi khi ghi file" + e);}
    }

}
