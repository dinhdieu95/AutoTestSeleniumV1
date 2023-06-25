package run.statictest;

public class Logger { //khối static
    private static String logLevel;

    static {

// Khối static để khởi tạo giá trị cho biến logLevel

        logLevel = "INFO";

        System.out.println("Logger initialized with log level: " + logLevel);

    }

    public static void main(String[] args) {

// Các công việc khác...

    }
}
