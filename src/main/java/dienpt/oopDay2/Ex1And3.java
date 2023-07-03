package dienpt.oopDay2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//1. tạo file hocsinh.txt
//        tạo 1 đối tương là học sinh: id, name, sdt, classs,
//        ghi vào file danh sách danh sách đối tượng học sinh
public class Ex1And3 {

    public static void main(String[] args) {
        File file = new File("/Users/phamdien/AutomationTest_K1_2023/SourceCode/Dien_Learn_AutoTest/AutoDayOne/src/main/java/run_Ex/oopDay2/hocsinh.txt");

        // Buoc 1 tao file
        Ex1And3 ex1 = new Ex1And3();
        ex1.taoFile(file);

        // Buoc 2 tao doi tuong
        Student dien = new Student();
        dien.setId(2);
        dien.setName("Coca");
        dien.setPhoneNumber("0999999999");
        dien.setClazz("TNEX");

        // Buoc 3 ghi vao file
        ex1.ghiFile(file, dien.toString());
        System.out.println("Ghi file thanh cong");

    }

    public void ghiFile(File file, String content) {
        try {
            //Here true is to append the content to file
            FileWriter fw = new FileWriter(file,true);
            //BufferedWriter writer give better performance
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            //Closing BufferedWriter Stream
            bw.close();
        } catch (Exception e) {
            System.out.println("Loi ghi file");
        }
    }

    public void taoFile(File file) {
        try {
            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Loi tao file");
        }
    }
}
