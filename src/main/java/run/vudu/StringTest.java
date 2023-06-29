package run.vudu;

import java.util.Locale;

public class StringTest {
    public static void main(String[] args) {
        String s = "Hello ca nha";
//        char[] listChar;
//        ArrayList<Character> listResult = new ArrayList<Character>();
        System.out.println(s.charAt(0));
        char[] listChar = s.toCharArray();
        System.out.println(s.length());
        System.out.println("Danh sách phần tử trong chuỗi: ");

        in(listChar);

        if (s.equalsIgnoreCase("hello ca nha")) {
            System.out.println("thỏa mãn điều kiện");
        }
        if (s.equals("hello ca nha")) {
            System.out.println("thỏa mãn điều kiện phân biệt hoa thường");
        } else {
            System.out.println("Không thỏa mãn điều kiện phân biệt hoa thường");
        }

        s = s.toUpperCase(Locale.ROOT);
        System.out.println("Chữ in hoa " + s);
        s = s.toLowerCase();
        System.out.println("Chữ in thường: " + s);

//        System.out.println(s.endsWith("nha") ? "Ham kiem tra kết thúc với giá trị = nhà": "Ham khong ket thuc voi gia trị là nhà");
        System.out.println(s.endsWith("nh") ? "Ham kiem tra kết thúc với giá trị = nhà" : "Ham khong ket thuc voi gia trị là nhà");
//        String s = "Hello ca nha";
//        System.out.println(s.contains("can \b " + "hello ")); //=> false
        System.out.println("can \t" + "hello ");
    }

    public static void in(char[] listChar) {
        for (char tmp : listChar) {
            System.out.println(tmp );
        }
    }
}
