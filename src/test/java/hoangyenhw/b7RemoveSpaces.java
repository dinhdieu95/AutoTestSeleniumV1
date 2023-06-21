package hoangyenhw;

public class b7RemoveSpaces {
    public static void main(String[] args) {
        String inputString = "  hello teacher     ";
        String trimmedString = removeSpaces(inputString);

        System.out.println("Original string: '" + inputString + "'");
        System.out.println("String with spaces removed: '" + trimmedString + "'");
    }

    public static String removeSpaces(String inputString) {
        // Remove leading and trailing spaces
        String trimmedString = inputString.trim();

        // Replace multiple consecutive spaces with a single space
        trimmedString = trimmedString.replaceAll("\\s+", " ");

        return trimmedString;
    }
}
