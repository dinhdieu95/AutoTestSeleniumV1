package run.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {

        try {
            String path = System.getProperty("user.dir") + "/src/main/resources/fileRead.txt";
            File file = new File(path); // Thay đổi đường dẫn và tên tệp tin tùy ý
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy tệp tin.");
            e.printStackTrace();
        }
//        try {
//            int x = 1;
//            int y = 0;
//            System.out.println(x / y);
//        }catch (Exception e){
//            System.out.println("lỗi chia cho 0 ");
//        }

    }
}
