package run.exception;

public class ExceptionHandlingExampleThrow {
    public static void main(String[] args) {
        int result = divide(10, 0);
        System.out.println("Kết quả: " + result);
        System.out.println("Tiếp tục luồng");
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        }
        return a / b;
    }
}
