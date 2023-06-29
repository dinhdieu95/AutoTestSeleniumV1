package hanhttm_bt_javacore.OopLogger;

public class Logger {
    final String LOG_FILE="abc";

   void writeLOG_FILE() {
        System.out.println("print log file " + LOG_FILE);
    }

    public static void main(String[] args) {
       Logger logger = new Logger() ;
       logger.writeLOG_FILE();
    }
}
