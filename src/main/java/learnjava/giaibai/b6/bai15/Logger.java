package learnjava.giaibai.b6.bai15;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private static final String LOG_FILE = "logfile.txt";

    private Logger() {
        // Lớp final không thể được kế thừa, nên chúng ta sẽ ngăn chặn việc khởi tạo đối tượng Logger bằng cách tạo constructor private.
    }

    public static void log(String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            writer.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Logger.log("Logging message 1");
        Logger.log("Logging message 2");
    }
}
