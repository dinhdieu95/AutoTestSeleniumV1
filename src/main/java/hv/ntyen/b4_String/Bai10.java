//Cho một chuỗi bất kỳ, hãy viết chương trình để kiểm tra xem chuỗi đó có phải là số nguyên dương hay không.
package hv.ntyen.b4_String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai10 {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';
    public static String st1 = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi st: ");
        String st = sc.nextLine();
        Pattern pattern = Pattern.compile("[a-zA-Z_\\s0-9]");
        Matcher matcher = pattern.matcher(st);

        while (matcher.find()) {
            System.out.print(st.substring(matcher.start(), matcher.end()));
            String st1 = st.substring(matcher.start(), matcher.end());
        }

        System.out.print("Số từ của chuỗi đã cho là: "
                + countWords(st1));
    }
    public static int countWords(String input) {
        if (input == null) {
            return -1;
        }
        int count = 0;
        int size = input.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != SPACE && input.charAt(i) != TAB
                    && input.charAt(i) != BREAK_LINE) {
                if(notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        return count;
    }

}
