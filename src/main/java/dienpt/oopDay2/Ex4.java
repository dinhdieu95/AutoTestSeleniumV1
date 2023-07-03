package dienpt.oopDay2;

import java.io.File;

public class Ex4 {
    public String path = "/Users/phamdien/AutomationTest_K1_2023/SourceCode/Dien_Learn_AutoTest/AutoDayOne/src/main/java/run_Ex/oopDay2/lop.txt";

    public void deleteFile() {
        try {
            File file = new File(path);
            if (file.delete()) {
                System.out.println(file.getName() + " is deleted!");
            } else {
                System.out.println("Delete operation is failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Ex4 ex4 = new Ex4();
        ex4.deleteFile();
    }
}
