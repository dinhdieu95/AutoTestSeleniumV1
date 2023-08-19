package hoangyenhw;

public class b3CompareString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        boolean areSame = compareStrings(str1, str2);

        if (areSame) {
            System.out.println("The strings are the same.");
        } else {
            System.out.println("The strings are different.");
        }
    }

    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }
}

