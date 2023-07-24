package run.statictest;

import java.util.ArrayList;

public class Logger { //khối static
    private static String logLevel;

    static {

// Khối static để khởi tạo giá trị cho biến logLevel

        logLevel = "INFO";

        System.out.println("Logger initialized with log level: " + logLevel);

        System.out.println("Test block static");

    }

    public static void main(String[] args) {
//        BlockStatic test  = new BlockStatic();
//        test = new BlockStatic("Hạnh");
//        System.out.println(test.getName());
        ArrayList<BlockStatic> listTest = new ArrayList<>();
        // Các công việc khác...
        listTest.add(new BlockStatic());
        print(listTest);
//
        listTest.add(new BlockStatic("hạnh"));
        print(listTest);
        listTest.add(new BlockStatic("Yến"));
        print(listTest);
        listTest.add(new BlockStatic());
        print(listTest);
//        System.out.println(listTest.toString());


    }
    public static void  print( ArrayList<BlockStatic> listTest){
        System.out.println("Kết qua nhập vào: ");
        for (BlockStatic temp: listTest ){
            System.out.println(temp.toString());
        }
    }
}
