package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.*;
import java.util.Date;
import java.util.StringTokenizer;

import static common.Common.CONFIG_DRIVER_CHROME;
import static common.Common.URL_SRC_CHROME;

public class CookieTest {
    WebDriver driver;

    @Test
    public void writeTest() {
        WebDriver driver;
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        try {
            // Tạo đối tượng tệp "Cookies.data" để đọc thông tin cookie
            File file = new File("Cookies.data");
            FileReader fileReader = new FileReader(file);
            BufferedReader Buffreader = new BufferedReader(fileReader);
            String strline;
            while ((strline = Buffreader.readLine()) != null) {
                // Phân tích thông tin cookie từ chuỗi đọc được
                StringTokenizer token = new StringTokenizer(strline, ";");
                while (token.hasMoreTokens()) {
                    String name = token.nextToken();
                    String value = token.nextToken();
                    String domain = token.nextToken();
                    String path = token.nextToken();
                    Date expiry = null;

                    String val;
                    if (!(val = token.nextToken()).equals("null")) {
                        expiry = new Date(val);
                    }
                    boolean isSecure = new Boolean(token.nextToken()).booleanValue();
                    Cookie ck = new Cookie(name, value, domain, path, expiry, isSecure);
                    System.out.println(ck);
                    driver.manage().addCookie(ck); // Thêm cookie đã lưu vào phiên làm việc hiện tại
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        driver.get("https://demo.guru99.com/test/cookie/selenium_aut.php");
        driver.close();
    }
    @Test
    public void readTest() {
        WebDriver driver;
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/cookie/selenium_aut.php");

        // Nhập địa chỉ Email và Mật khẩu nếu bạn đã đăng ký trước đó
        driver.findElement(By.name("username")).sendKeys("abc123");
        driver.findElement(By.name("password")).sendKeys("123xyz");
        driver.findElement(By.name("submit")).click();

        // Tạo tệp có tên là "Cookies" để lưu Thông tin Đăng nhập
        File file = new File("Cookies.data");
        try
        {
            // Xóa tệp cũ nếu tồn tại
            file.delete();
            file.createNewFile();
            FileWriter fileWrite = new FileWriter(file);
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);

            // Lặp để lấy thông tin cookie
            for (Cookie ck : driver.manage().getCookies())
            {
                Bwrite.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";" + ck.getExpiry() + ";" + ck.isSecure()));
                Bwrite.newLine();
            }

            Bwrite.close();
            fileWrite.close();

        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
        driver.close();
    }
}
