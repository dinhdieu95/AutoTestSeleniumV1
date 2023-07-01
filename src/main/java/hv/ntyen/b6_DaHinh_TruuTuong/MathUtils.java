//Tạo một lớp final có tên là "MathUtils" chứa các phương thức toán học tĩnh (static) như tính giai thừa, tính lũy thừa, tính căn bậc hai, và tính tổng các số trong một mảng.
package hv.ntyen.b6_DaHinh_TruuTuong;

public final class MathUtils {
    private MathUtils(){

    }
    public static int giaiThua(int n){
        if(n<0){
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
        int result =1;
        for(int i = 1; i<=n; i++){
            result *=i;
        }
        return result;

    }
    public static double luyThua(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double canBacHai(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Input must be a non-negative number.");
        }

        return Math.sqrt(number);
    }

    public static int TongMang(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    public static void main(String[] args) {
        int factorialResult = MathUtils.giaiThua(10);
        System.out.println("Giai thừa của 10: " + factorialResult);

        double powerResult = MathUtils.luyThua(5, 5);
        System.out.println("Luỹ thừa 5 mũ 5: " + powerResult);

        double squareRootResult = MathUtils.canBacHai(16);
        System.out.println("Căn bậc hai của 16: " + squareRootResult);

        int[] numbers = {1, 2, 3, 4, 5};
        int sumResult = MathUtils.TongMang(numbers);
        System.out.println("Tổng các số trong mảng: " + sumResult);
    }
}
