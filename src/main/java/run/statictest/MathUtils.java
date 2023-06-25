package run.statictest;

public class MathUtils {//phương thức static
    public static int sum(int a, int b) {

        return a + b;

    }

    public static void main(String[] args) {

        int result = MathUtils.sum(5, 3);

        System.out.println("Sum: " + result); // Kết quả: 8

    }
}
