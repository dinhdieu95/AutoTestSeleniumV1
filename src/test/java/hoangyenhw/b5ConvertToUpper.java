package hoangyenhw;

public class b5ConvertToUpper {
    public static void main(String[] args) {
        String inputString = "how are you";
        String upperString = convertToUpper(inputString);
        System.out.println("Uppercase string: " + upperString);
    }

    public static String convertToUpper(String inputString) {
        return inputString.toUpperCase();
    }
}
