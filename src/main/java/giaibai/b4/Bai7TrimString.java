package giaibai.b4;

public class Bai7TrimString {
    public static void main(String[] args) {
        String input = "   Hello, World!   ";
        String trimmedString = trimString(input);
        System.out.println(trimmedString);
    }

    public static String trimString(String input) {
        return input.trim();
    }
}
