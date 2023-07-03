package giaibai.b7;

import giaibai.b7.bai1.HocSinh;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Bai3 {
    public static void main(String[] args) {
        try {
            String path = "hocsinh.txt";
            File file = new File(path); // Thay đổi đường dẫn và tên tệp tin tùy ý

            FileWriter fileWriter = new FileWriter(file, true); // Mở chế độ ghi nối (append mode)
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            HocSinh hs = new HocSinh(1, "Nguyen Van A", "1234567890", "10A");


            bufferedWriter.write(hs.toString());
            bufferedWriter.newLine(); // Thêm một dòng mới

            bufferedWriter.close();
            System.out.println("Nối tệp tin thành công!");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi nối tệp tin.");
            e.printStackTrace();
        }
    }
}
