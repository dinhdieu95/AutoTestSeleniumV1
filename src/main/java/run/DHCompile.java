package run;

public class DHCompile {
    // hàm tính tổng thứ 1
    public static int add(int a, int b) {
        return a + b;
    }

    // Hàm tính tổng thứ 2
    public static double add(double a, double b) {
        return a + b;
    }

    // hàm chạy
    public static void main(String args[]) {
        // Gọi hàm tính tổng thứ nhất
        System.out.println(add(2, 3));

        // Gọi hàm tính tổng thứ 2
        System.out.println(add(2.0, 3.0));
    }
}
