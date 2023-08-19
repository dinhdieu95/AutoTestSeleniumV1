package hoangyenhw;

public class b10CountLetter {
    public static void main(String[] args) {
        char letter = 'a';
        String inputString = "Jana has a fat cat";
        int letterCount = countLetter(inputString, letter);

        System.out.println("Number of occurrences of '" + letter + "': " + letterCount);
    }

    public static int countLetter(String inputString, char letter) {
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}
