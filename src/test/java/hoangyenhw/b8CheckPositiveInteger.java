package hoangyenhw;

public class b8CheckPositiveInteger {
    public static void main(String[] args) {
        String inputString = "hello";
        boolean isPositiveInteger = checkPositiveInteger(inputString);

        if (isPositiveInteger) {
            System.out.println("The string represents a positive integer.");
        } else {
            System.out.println("The string does not represent a positive integer.");
        }
    }

    public static boolean checkPositiveInteger(String inputString) {
        // Remove decimal point and fractional part
        String integerString = inputString.replace(".", "");

        // Check if the resulting string is a positive integer
        try {
            int number = Integer.parseInt(integerString);
            return number > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

