package giaibai.b4;

public class Bai10CountOccurrences {
    public static void main(String[] args) {
        String input = "Hello, World!";
        char target = 'o';
        int count = countOccurrences(input, target);
        System.out.println("Number of occurrences: " + count);
    }

    public static int countOccurrences(String input, char target) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}
