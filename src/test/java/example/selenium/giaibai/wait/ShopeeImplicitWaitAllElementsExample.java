package example.selenium.giaibai.wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static common.Common.CONFIG_DRIVER_CHROME;
import static common.Common.URL_SRC_CHROME;

public class ShopeeImplicitWaitAllElementsExample {
    WebDriver driver;

    @Test
    public void test() throws Exception {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://shopee.vn/");


    }


    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
