package giaibai.b7.bai1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HocSinh {
    private int id;
    private String name;
    private String sdt;
    private String classs;

    public HocSinh(int id, String name, String sdt, String classs) {
        this.id = id;
        this.name = name;
        this.sdt = sdt;
        this.classs = classs;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSdt() {
        return sdt;
    }

    public String getClasss() {
        return classs;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sdt='" + sdt + '\'' +
                ", classs='" + classs + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<HocSinh> danhSachHocSinh = new ArrayList<>();
        danhSachHocSinh.add(new HocSinh(1, "Nguyen Van A", "1234567890", "10A"));
        danhSachHocSinh.add(new HocSinh(2, "Tran Thi B", "0987654321", "11B"));
        danhSachHocSinh.add(new HocSinh(3, "Le Van C", "9876543210", "12C"));

        String filePath = "hocsinh.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (HocSinh hocSinh : danhSachHocSinh) {
                String line = hocSinh.getId() + "," + hocSinh.getName() + "," + hocSinh.getSdt() + "," + hocSinh.getClasss();
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Đã ghi danh sách học sinh vào file thành công!");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi ghi file: " + e.getMessage());
        }

    }
}