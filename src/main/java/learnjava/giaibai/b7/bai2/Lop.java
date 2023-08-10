package learnjava.giaibai.b7.bai2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Lop {
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
        String filePath = "danh_sach_lop.txt";
        List<Lop> danhSachLop = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Bỏ qua dòng tiêu đề
            br.readLine();
            // nội dung bên trong
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                String email = data[2].trim();
                Lop lop = new Lop(id, name, email);
                danhSachLop.add(lop);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // In danh sách lớp ra màn hình
        for (Lop lop : danhSachLop) {
            System.out.println("Lớp: " + lop.getId() + ", " + lop.getName() + ", " + lop.getEmail());
        }
    }
}
