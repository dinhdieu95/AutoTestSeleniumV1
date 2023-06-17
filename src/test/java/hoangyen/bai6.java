package hoangyen;
import java.util.ArrayList;
import java.util.Collections;

public class bai6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(7);

        int maxNumber = Collections.max(numbers);
        int minNumber = Collections.min(numbers);

        System.out.println("Maximum integer: " + maxNumber);
        System.out.println("Minimum integer: " + minNumber);
    }
}
