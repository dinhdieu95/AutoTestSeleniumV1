package hoangyenhw;

public class b2countchar {
    public static void main(String[] args) {
        String str = "hello";
        int charCount = countCharacters(str);
        System.out.println("Number of characters: " + charCount);
    }

    public static int countCharacters(String str) {
        return str.length();
    }
}

