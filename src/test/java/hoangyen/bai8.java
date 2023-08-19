package hoangyen;
import java.util.ArrayList;
public class bai8 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(7);

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of all integers: " + sum);
    }
}
