package hvduc.buoi7.bai15;

import java.io.*;
import java.util.Scanner;

public class Logger {
    private final static String LOG_FILE = "log.txt"; //file được lưu ở project
    public static void log(String mess){
        try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE,true))){
            writer.println(mess);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void read() {
        String ulr = "D:\\Learning\\Workshop\\AutoTestSelenium\\log.txt";
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(ulr);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner sc = new Scanner(fileInputStream);
        try {
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }finally {
            try {
                sc.close();
                fileInputStream.close();
            }catch (IOException e){
                System.out.println("Lỗi rồi huhu");
            }
        }
    }
}

