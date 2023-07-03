package giaibai.b4;

public class Bai8CheckPositiveInteger {
    public static void main(String[] args) {
        String input = "12345";
        boolean isPositiveInteger = checkPositiveInteger(input);
        if (isPositiveInteger) {
            System.out.println("String is a positive integer.");
        } else {
            System.out.println("String is not a positive integer.");
        }
    }

    public static boolean checkPositiveInteger(String input) {
        try {
            int number = Integer.parseInt(input);
            return number > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
