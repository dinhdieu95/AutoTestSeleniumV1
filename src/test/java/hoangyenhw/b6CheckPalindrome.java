package hoangyenhw;

public class b6CheckPalindrome {
    public static void main(String[] args) {
        String inputString = "madam";
        boolean isPalindrome = checkPalindrome(inputString);

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String inputString) {
        int length = inputString.length();
        for (int i = 0; i < length / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

