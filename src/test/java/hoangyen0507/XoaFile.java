package hoangyen0507;

import java.io.File;

public class XoaFile {
    public static void main(String[] args) {
        String fileName = "hocsinh.txt";

        File file = new File(fileName);

        if (file.delete()) {
            System.out.println("File " + fileName + " đã được xóa thành công.");
        } else {
            System.out.println("Không thể xóa file " + fileName);
        }
    }
}
