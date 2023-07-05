package hoangyen0507;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HocSinhMoi {
    private int id;
    private String name;
    private String phone;
    private String classs;

    public HocSinhMoi(int id, String name, String phone, String classs) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.classs = classs;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getClasss() {
        return classs;
    }

    public static void main(String[] args) {
        HocSinh[] danhSachHocSinh = new HocSinh[3];
        danhSachHocSinh[0] = new HocSinh(1, "An", "123456789", "10A");
        danhSachHocSinh[1] = new HocSinh(2, "Binh", "987654321", "11B");
        danhSachHocSinh[2] = new HocSinh(3, "Minh", "555555555", "12C");

        HocSinh hocSinhMoi = new HocSinh(4, "Ba", "111111111", "9A");
        themHocSinhVaoDanhSach(danhSachHocSinh, hocSinhMoi);
        ghiDanhSachHocSinhVaoFile(danhSachHocSinh);
    }

    public static void themHocSinhVaoDanhSach(HocSinh[] danhSachHocSinh, HocSinh hocSinhMoi) {
        HocSinh[] newDanhSachHocSinh = new HocSinh[danhSachHocSinh.length + 1];
        System.arraycopy(danhSachHocSinh, 0, newDanhSachHocSinh, 0, danhSachHocSinh.length);
        newDanhSachHocSinh[danhSachHocSinh.length] = hocSinhMoi;
        danhSachHocSinh = newDanhSachHocSinh;
    }

    public static void ghiDanhSachHocSinhVaoFile(HocSinh[] danhSachHocSinh) {
        try {
            FileWriter fileWriter = new FileWriter("hocsinh.txt", true); // Mở file để ghi tiếp vào cuối file
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (HocSinh hocSinh : danhSachHocSinh) {
                printWriter.println("ID: " + hocSinh.getId());
                printWriter.println("Name: " + hocSinh.getName());
                printWriter.println("Phone: " + hocSinh.getPhone());
                printWriter.println("Class: " + hocSinh.getClasss());
                printWriter.println();
            }

            printWriter.close();
            System.out.println("Danh sách học sinh đã được ghi vào file hocsinh.txt.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}