package hv.ntyen.b4_String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B10 {
    public static void main(String[] args) {
//        String text1 = "Hello java regex 2-12-2018, hello world 12/12/2018";
        String text1 = "Hello viet nam//";
        Pattern pattern = Pattern.compile("[a-zA-Z_\\s0-9]");
//        Pattern pattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
        Matcher matcher = pattern.matcher(text1);

        System.out.println("Ngày tháng trong chuỗi text1: " + text1);
        while (matcher.find()) {
            System.out.print(text1.substring(matcher.start(), matcher.end()));
        }

    }
}
