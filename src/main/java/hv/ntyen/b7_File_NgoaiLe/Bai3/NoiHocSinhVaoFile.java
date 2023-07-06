package hv.ntyen.b7_File_NgoaiLe.Bai3;

import hv.ntyen.b7_File_NgoaiLe.Bai1.HocSinh;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NoiHocSinhVaoFile {
    public static void main(String[] args) {
        try {
            String path = "hocsinh.txt";
            File file = new File(path);

            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            HocSinh hs = new HocSinh(5, "Chi", "0632152241", "12D");
            bufferedWriter.write(hs.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
            System.out.println("Nối tệp tin thành công!");
        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra khi nối tệp tin.");
            e.printStackTrace();
        }
    }
}
