package run.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
//            String path = System.getProperty("user.dir") + "/src/test/resources/fileWrite.txt";
            processFile("path/to/nonexistent_file.txt");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }

    public static void processFile(String filePath) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            System.out.println("Tiep tục khối final");
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Đã xảy ra lỗi khi đóng tệp tin.");
                }
            }
        }
    }
}
