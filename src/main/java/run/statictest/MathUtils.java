package run.statictest;

public class MathUtils {//phương thức static

    public static int sum(int a, int b) {

        return a + b;

    }

    public static int sum(float a, float b) {

        return (int) (a + b);

    }

    public static void main(String[] args) {

        int result = MathUtils.sum(5.4f, 3.5f);

        System.out.println("Sum: " + result); // Kết quả: 8

    }
}
