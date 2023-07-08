package hanhttm_bt_javacore.file;

import java.io.*;

public class Student4 {
    public static void main(String[] args) {
        try{
            String filePath = "student.txt";
            File file = new File(filePath);
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Student2 student2 = new Student2(4,"ccc",234);
            bufferedWriter.write(student2.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
            System.out.println("noi thanh cong");
        } catch (IOException e){
            System.out.println("loi ghi file");
            e.printStackTrace();
        }
    }
}
