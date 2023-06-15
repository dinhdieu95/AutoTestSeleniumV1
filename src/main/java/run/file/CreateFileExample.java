package run.file;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        try {
            String path = System.getProperty("user.dir") + "/src/test/resources/file.txt";
            File file = new File(path); // Thay đổi đường dẫn và tên tệp tin tùy ý

            if (file.createNewFile()) {
                System.out.println("Tạo tệp tin thành công!");
            } else {
                System.out.println("Tệp tin đã tồn tại.");
            }
//            sử dụng mkdir
//            if (file.mkdir()) {
//                System.out.println("Tạo thư mục thành công!");
//            } else {
//                System.out.println("Thư mục đã tồn tại hoặc không thể tạo.");
//            }
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi tạo tệp tin.");
            e.printStackTrace();
        }
    }
}
