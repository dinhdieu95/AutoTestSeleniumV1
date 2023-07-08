package hanhttm_bt_javacore.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Student2 {
    private int id;
    private String name;
    private int mobile;

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile=" + mobile +
                '}';
    }

    public Student2(int id, String name, int mobile) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
    }
    public static void main(String[] args) {
        List<Student2> student2List = new ArrayList<>();
        student2List.add(new Student2(1, "Nguyen Van A", 1234567890));
        student2List.add(new Student2(2, "Tran Thi B", 987654321));
        student2List.add(new Student2(3, "Le Van C", 876543210));

        String filePath = "student.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Student2 student2 : student2List) {
                String line = student2.toString();
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Đã ghi danh sách học sinh vào file thành công!");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi ghi file: " + e.getMessage());
            throw new RuntimeException(e);

        }

    }
}
