package hoangyen;
import java.util.ArrayList;
import java.util.Collections;

public class bai5 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(7);

        Collections.sort(numbers);

        System.out.println("Result:");
        for (int number : numbers) {
            System.out.println(number + "");
        }
    }
}

