//Cho một chuỗi bất kỳ, hãy viết chương trình để đếm số lượng từ trong chuỗi đó.
package hv.ntyen.b4_String;

import java.util.Scanner;

public class Bai9 {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kỳ: ");
        String str= sc.nextLine();
        System.out.print("Số từ của chuỗi đã cho là: "
                + countWords(str));
    }
    // Hàm tính số lượng các từ trong chuỗi
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
