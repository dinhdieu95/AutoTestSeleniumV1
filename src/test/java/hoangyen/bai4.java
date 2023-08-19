package hoangyen;

public class bai4 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};

        int target = 14;

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                int complement = target - currentNumber;
                if (numbers[j] == complement) {
                    System.out.println("Pair found: " + currentNumber + " + " + numbers[j] + " = " + target);
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No pair found.");
        }
    }
}
