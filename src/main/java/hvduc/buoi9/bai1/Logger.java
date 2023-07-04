package hvduc.buoi9.bai1;

import java.io.*;
import java.util.Scanner;

public class Logger {
    private final static String LOG_FILE = "hocsinh.txt"; //file được lưu ở project

    public static void log(String listStu) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            writer.println(listStu);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void read() {
        String ulr = "D:\\Learning\\Workshop\\AutoTestSelenium\\hocsinh.txt";
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(ulr);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(fileInputStream);
        try {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } finally {
            try {
                sc.close();
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println("Lỗi rồi huhu");
            }
        }
    }

    public void deleteFile(){ //Xóa file
        File file = new File("D:\\Learning\\Workshop\\AutoTestSelenium\\hocsinh.txt");
        if(file.delete()){
            System.out.println(file.getName() + " đã xóa");
        }else {
            System.out.println("Xóa thành công");
        }
    }
}

