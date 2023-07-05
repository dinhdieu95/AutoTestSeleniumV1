package hv.ntyen.b7_File_NgoaiLe.Bai2;

import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Lop {
    private int id;
    private String name, email;
    public Lop(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email= email;
    }
    public int getId(){return id;}
    public String getName(){return name;}
    public String getEmail(){return email;}

        public static void main(String[] args) {
            String file = "lop.txt";
            List<Lop> danhSachLop = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                br.readLine();
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
            System.out.println("Danh sách lớp:");
            for (Lop lop : danhSachLop) {
                System.out.println(+ lop.getId() + ", " + lop.getName() + ", " + lop.getEmail());
            }
        }


}
