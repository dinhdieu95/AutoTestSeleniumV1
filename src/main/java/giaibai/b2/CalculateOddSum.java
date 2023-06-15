package giaibai.b2;

public class CalculateOddSum {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;

        while (number <= 100) {
            if (number % 2 != 0) {
                sum += number;
            }
            number++;
        }

        System.out.println("Tổng các số lẻ từ 1 đến 100: " + sum);
    }

}
