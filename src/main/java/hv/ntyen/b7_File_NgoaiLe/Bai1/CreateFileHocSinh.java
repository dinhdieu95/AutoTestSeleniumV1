package hv.ntyen.b7_File_NgoaiLe.Bai1;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.io.File;
import java.io.IOException;

public class CreateFileHocSinh {
    public static void main(String[] args) {
        try {
            String path = System.getProperty("user.dir") + "/src/test/resources/hocsinh.txt";
            File file = new File(path);
            if (file.createNewFile()){
                System.out.println("Tạo file thành công!");
            }else {
                System.out.println("File đã tồn tại.");
            }
            HocSinh hs = new HocSinh("001","Yến", (String)"0912345678", "Toán" );

        }
        catch (IOException e) {
            System.out.print(" Có lỗi khi tạo file!");
            e.printStackTrace();
        }

    }
}
