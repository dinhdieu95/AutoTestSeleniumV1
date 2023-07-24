package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class ProxyTest {
    WebDriver driver;

    @Test
    public void proxy() {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("<HOST:PORT>");
        ChromeOptions options = new ChromeOptions();
        options.setCapability("proxy", proxy);
        // config sử dụng trình duyệt nào "webdriver.chrome.driver"
//        URL_SRC_CHROME đường dẫn tới file driver
        driver = new ChromeDriver(options);
        driver.get("https://demo.guru99.com/test/delete_customer.php"); // truy cập trang web
        driver.close();
    }
}
