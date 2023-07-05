package hv.ntyen.b7_File_NgoaiLe.Bai4;

import java.io.File;
import java.io.IOException;

public class XoaFileLop {
    public static void main(String[] args) {
        String path = "lop1.txt";
        File file = new File(path);
        try {

            if (file.createNewFile()) {
                System.out.println("Tạo tệp tin thành công!");
            } else {
                System.out.println("Tệp tin đã tồn tại.");
            }
        } catch (IOException e) {
            System.out.println("Có lỗi khi tạo tệp tin.");
            e.printStackTrace();
        }
        if (file.delete()) {
            System.out.println("Xóa tệp tin thành công!");
        } else {
            System.out.println("Có lỗi khi xoá tệp tin.");
        }

    }
}
