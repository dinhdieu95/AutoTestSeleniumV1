package hoangyen;
import java.util.ArrayList;
import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter positive integers (enter 0 or a negative number to stop):");


        int number;
        while (true) {
            number = scanner.nextInt();

            if (number <= 0) {
                break;
            }

            numbers.add(number);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of positive integers: " + sum);

        scanner.close();
    }
}