package hoangyen0507;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lop {
    private int id;
    private String name;
    private String email;

    public Lop(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {
        docVaHienThiDanhSachLop("danh_sach_lop.txt");
    }

    public static void docVaHienThiDanhSachLop(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 3) {
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    String email = data[2];

                    Lop lop = new Lop(id, name, email);
                    hienThiThongTinLop(lop);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void hienThiThongTinLop(Lop lop) {
        System.out.println("ID: " + lop.getId());
        System.out.println("Name: " + lop.getName());
        System.out.println("Email: " + lop.getEmail());
        System.out.println();
    }
}

