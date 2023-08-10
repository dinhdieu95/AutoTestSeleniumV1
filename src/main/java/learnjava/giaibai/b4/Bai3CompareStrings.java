package learnjava.giaibai.b4;

public class Bai3CompareStrings {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        boolean isEqual = compareStrings(str1, str2);
        if (isEqual) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }

    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

}
