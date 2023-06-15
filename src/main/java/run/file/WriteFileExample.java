package run.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        try {
            String path = System.getProperty("user.dir") + "/src/test/resources/fileWrite.txt";
            File file = new File(path); // Thay đổi đường dẫn và tên tệp tin tùy ý

            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Dòng thứ nhất");
            bufferedWriter.newLine(); // Thêm một dòng mới
            bufferedWriter.write("Dòng thứ hai");

            bufferedWriter.close();
            System.out.println("Ghi tệp tin thành công!");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi ghi tệp tin.");
            e.printStackTrace();
        }
    }
}
