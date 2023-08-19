package hoangyenhw;

public class b9CountWords {
    public static void main(String[] args) {
        String inputString = "i am fine thank you";
        int wordCount = countWords(inputString);

        System.out.println("Number of words: " + wordCount);
    }

    public static int countWords(String inputString) {
        String[] words = inputString.split(" ");
        return words.length;
    }
}
