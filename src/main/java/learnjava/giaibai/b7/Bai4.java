package learnjava.giaibai.b7;

import java.io.File;
import java.io.IOException;

public class Bai4 {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/src/test/resources/danh_sach_lop.txt";
        File file = new File(path); // Thay đổi đường dẫn và tên tệp tin tùy ý

        // Tạo tệp tin
        try {

            if (file.createNewFile()) {
                System.out.println("Tạo tệp tin thành công!");
            } else {
                System.out.println("Tệp tin đã tồn tại.");
            }
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi tạo tệp tin.");
            e.printStackTrace();
        }

        // Xóa tệp tin
        File fileToDelete = new File(path); // Thay đổi đường dẫn và tên tệp tin tùy ý

        if (fileToDelete.delete()) {
            System.out.println("Xóa tệp tin thành công!");
        } else {
            System.out.println("Không thể xóa tệp tin.");
        }
    }
}
