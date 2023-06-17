package hoangyen;
import java.util.Arrays;
public class baitap1 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6};
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println("Sorted array in descending order: ");
        for (int number : numbers) {
            System.out.print(number + "");
        }
    }
}
