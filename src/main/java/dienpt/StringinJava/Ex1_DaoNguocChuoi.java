package dienpt.StringinJava;

public class Ex1_DaoNguocChuoi {
    public void reverseWordInMyString(String str)
    {
        String reversedWord = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversedWord = reversedWord + str.charAt(i);
        }
        
        System.out.println("My string is: " + str);
        System.out.println("My reversed string is: " + reversedWord);
    }
    public static void main(String[] args)
    {
        Ex1_DaoNguocChuoi obj = new Ex1_DaoNguocChuoi();
        obj.reverseWordInMyString("HELLO WOLRD !!");
        obj.reverseWordInMyString("CHAO CAC BAN !!");
    }
}
