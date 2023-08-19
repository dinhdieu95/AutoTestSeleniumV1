package hoangyen;
import java.util.ArrayList;

public class bai11 {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        int number = 2;

        do {
            evenNumbers.add(number);
            number += 2;
        } while (number <= 100);

        System.out.println("Even numbers from 2 to 100:");
        for (int evenNumber : evenNumbers) {
            System.out.print(evenNumber + " ");
        }
    }
}
