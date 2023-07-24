package giaibai.b4;

public class Bai9CountWords {
    public static void main(String[] args) {
        String input = "Hello, World!";
        int count = countWords(input);
        System.out.println("Number of words: " + count);
    }

    public static int countWords(String input) {
        String[] words = input.split("\\s+");
        return words.length;
    }
}
