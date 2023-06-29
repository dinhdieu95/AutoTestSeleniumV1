package giaibai.b4;

public class Bai4SplitString {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String[] words = splitString(input);
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static String[] splitString(String input) {
        return input.split(" ");
    }
}
