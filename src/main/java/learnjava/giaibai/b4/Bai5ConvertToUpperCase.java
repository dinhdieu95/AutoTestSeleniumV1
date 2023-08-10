package learnjava.giaibai.b4;

public class Bai5ConvertToUpperCase {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String upperCaseString = convertToUpperCase(input);
        System.out.println(upperCaseString);
    }

    public static String convertToUpperCase(String input) {
        return input.toUpperCase();
    }
}
