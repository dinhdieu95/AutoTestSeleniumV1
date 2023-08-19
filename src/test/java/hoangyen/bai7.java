package hoangyen;
import java.util.ArrayList;
import java.util.HashSet;

public class bai7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(5);
        numbers.add(2);
        numbers.add(7);

        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);
        numbers.clear();
        numbers.addAll(uniqueNumbers);
        System.out.println("ArrayList without duplicate numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}