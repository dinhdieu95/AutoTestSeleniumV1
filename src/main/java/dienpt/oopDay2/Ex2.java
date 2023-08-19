package dienpt.oopDay2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ex2 {

    public String path = "/Users/phamdien/AutomationTest_K1_2023/SourceCode/Dien_Learn_AutoTest/AutoDayOne/src/main/java/run_Ex/oopDay2/lop.txt";
    public static void main(String[] args) {
        Ex2 ex2 = new Ex2();
        ex2.docFile();
        List<Student2> data = ex2.docFile();
        ex2.showData(data);
    }

    public void showData(List<Student2> data) {
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i).toString());
        }
    }

    public List<Student2> docFile() {
        List<Student2> data = new ArrayList<>();
        Student2 student2 = new Student2();
        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                line = bufferedReader.readLine();

                if(line != null) {
                    String [] array = line.split(",");
                    student2.setId(Integer.valueOf(array[0]));
                    student2.setName(array[1]);
                    student2.setEmail(array[2]);

                    data.add(student2);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
