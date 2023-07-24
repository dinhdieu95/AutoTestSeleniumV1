package run.exception;

public class ExceptionHandlingExampleTryCatch {
    public static void main(String[] args) {
        try {
            // Mã có khả năng ném ngoại lệ
            int result = divide(10, 0);
            System.out.println("Kết quả: " + result);
        } catch (ArithmeticException e) {
            // Xử lý ngoại lệ cụ thể (ArithmeticException)
            System.out.println("Lỗi chia cho 0: " + e.getMessage());
        }
//        finally {
//            // Mã được thực thi sau khi khối "try" và "catch" kết thúc
//            System.out.println("Khối finally được thực thi.");
//        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
