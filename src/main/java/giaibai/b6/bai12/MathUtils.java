package giaibai.b6.bai12;

public final class MathUtils {
    private MathUtils() {
        // Lớp final không thể được kế thừa, nên chúng ta sẽ ngăn chặn việc khởi tạo đối tượng MathUtils bằng cách tạo constructor private.
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Input must be a non-negative number.");
        }

        return Math.sqrt(number);
    }

    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static void main(String[] args) {
        int factorialResult = MathUtils.factorial(5);
        System.out.println("Factorial of 5: " + factorialResult);

        double powerResult = MathUtils.power(2, 3);
        System.out.println("2 raised to the power of 3: " + powerResult);

        double squareRootResult = MathUtils.squareRoot(25);
        System.out.println("Square root of 25: " + squareRootResult);

        int[] numbers = {1, 2, 3, 4, 5};
        int sumResult = MathUtils.sumArray(numbers);
        System.out.println("Sum of array: " + sumResult);
    }
}
