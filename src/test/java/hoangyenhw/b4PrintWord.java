package hoangyenhw;
public class b4PrintWord {
    public static void main(String[] args) {
        String sentence = "today is a happy day";
        String word = "happy";

        printWord(sentence, word);
    }

    public static void printWord(String sentence, String word) {
        String[] words = sentence.split(" ");
        for (String w : words) {
            if (w.equals(word)) {
                System.out.println(w);
                break;
            }
        }
    }
}

