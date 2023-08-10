package learnjava.run.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 3, 2, 1, 5, 6, 4, 7, 8, 7);

        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        System.out.println("Các phần tử duy nhất trong danh sách:");
        for (Integer number : uniqueNumbers) {
            System.out.println(number);
        }
    }

}
