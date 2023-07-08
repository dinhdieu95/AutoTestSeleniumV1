package hanhttm_bt_javacore.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Student3 {
    private int id;
    private String name;
    private String mail;

    public Student3(int id, String name, String mail) {
        this.id = id;
        this.name = name;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "Student3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String filePath="student2.txt";
        List<Student3> student3List = new ArrayList<>();
        try (BufferedReader br=new BufferedReader(new FileReader(filePath))){
         String line;
        // br.readLine();
         while ((line=br.readLine())!=null){
             String[] data=line.split(",");
             int id =Integer.parseInt(data[0].trim());
             String name = data[1].trim();
             String email=data[2].trim();
             Student3 student3 = new Student3(id,name,email);
             student3List.add(student3);
         }
        }catch (IOException e){
            e.printStackTrace();
        }
        for(Student3 student3:student3List){
         //   System.out.println(student3.toString());
            System.out.println("Student 3: " + student3.getId() + ", " + student3.getName() + ", " + student3.getMail());
        }
    }
}
