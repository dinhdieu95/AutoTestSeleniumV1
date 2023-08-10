package hv.ntyen.b7_File_NgoaiLe.Bai1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileHocSinh {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh(1, "Yến", "0912345678", "12A");
        HocSinh hs2 = new HocSinh(2, "Mai", "0912345699", "12B");
        HocSinh hs3 = new HocSinh(3, "lan", "0912345633", "12C");
        HocSinh hs4 = new HocSinh(4, "Trang", "0912345644", "12D");
        String filePath = "hocsinh.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            String line1 = hs1.getId() + "," + hs1.getName() + "," + hs1.getPhone() + "," + hs1.getClasss();
            writer.write(line1);
            writer.newLine();
            String line2 = hs2.getId() + "," + hs2.getName() + "," + hs2.getPhone() + "," + hs2.getClasss();
            writer.write(line2);
            writer.newLine();
            String line3 = hs3.getId() + "," + hs3.getName() + "," + hs3.getPhone() + "," + hs3.getClasss();
            writer.write(line3);
            writer.newLine();
            String line4 = hs4.getId() + "," + hs4.getName() + "," + hs4.getPhone() + "," + hs4.getClasss();
            writer.write(line4);
            writer.newLine();
            writer.flush();
            writer.close();
            System.out.println("Tạo và ghi danh sách học sinh vào file thành công!");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi tạo/ghi file: " + e.getMessage());
        }

    }
}
