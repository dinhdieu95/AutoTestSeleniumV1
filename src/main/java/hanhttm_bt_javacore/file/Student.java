package hanhttm_bt_javacore.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

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

    public static void writeFile(String fileName, Student student) throws IOException{
        FileOutputStream out = new FileOutputStream(fileName);
        PrintWriter output=new PrintWriter(out,true);
        output.println(student.toString());
        out.close();
        output.close();
    }

    public static void main(String[] args) throws IOException{
        Student student=new Student(1,"abc",0123);
        writeFile("output.txt",student);
    }
}
