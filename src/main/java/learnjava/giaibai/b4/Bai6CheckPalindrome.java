package learnjava.giaibai.b4;

public class Bai6CheckPalindrome {
    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = checkPalindrome(input);
        if (isPalindrome) {
            System.out.println("String is palindrome.");
        } else {
            System.out.println("String is not palindrome.");
        }
    }

    public static boolean checkPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
