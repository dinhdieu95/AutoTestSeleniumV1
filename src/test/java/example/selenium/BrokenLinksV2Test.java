package example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import static common.Common.CONFIG_DRIVER_CHROME;
import static common.Common.URL_SRC_CHROME;

public class BrokenLinksV2Test {
    @Test
    public void testBrokenLinks() {

        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        WebDriver driver = new ChromeDriver();

        // Di chuyển tới trang web BStackDemo
        driver.get("https://bstackdemo.com/");

        // Tìm tất cả các liên kết có sẵn trên trang web
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Duyệt qua từng liên kết và kiểm tra trạng thái phản hồi
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            verifyLink(url);
        }

        driver.quit();
    }

    // Hàm kiểm tra liên kết
    public void verifyLink(String url) {
        try {
            URL link = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
            httpURLConnection.setConnectTimeout(3000); // Thiết lập thời gian kết nối tối đa là 3 giây
            httpURLConnection.connect();

            if (httpURLConnection.getResponseCode() == 200) {
                System.out.println(url + " - " + httpURLConnection.getResponseMessage());
            } else {
                System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "là một liên kết hỏng");
            }
        } catch (Exception e) {
            System.out.println(url + " - " + "là một liên kết hỏng");
        }
    }


}
