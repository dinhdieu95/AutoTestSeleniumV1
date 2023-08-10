package learnjava.giaibai.b4;

public class Bai2CountCharacters {
    public static void main(String[] args) {
        String input = "Hello, World!";
        int count = countCharacters(input);
        System.out.println("Number of characters: " + count);
    }

    public static int countCharacters(String input) {
        return input.length();
    }
}
