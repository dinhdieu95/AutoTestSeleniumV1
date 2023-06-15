package run.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFileExample {
    public static void main(String[] args) {
        try {
            String path = System.getProperty("user.dir") + "/src/test/resources/fileWrite.txt";
            File file = new File(path); // Thay đổi đường dẫn và tên tệp tin tùy ý

            FileWriter fileWriter = new FileWriter(file, true); // Mở chế độ ghi nối (append mode)
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Dòng tiếp theo được nối vào");
            bufferedWriter.newLine(); // Thêm một dòng mới

            bufferedWriter.close();
            System.out.println("Nối tệp tin thành công!");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi nối tệp tin.");
            e.printStackTrace();
        }
    }
}