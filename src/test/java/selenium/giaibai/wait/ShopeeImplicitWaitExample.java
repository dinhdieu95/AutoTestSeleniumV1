package selenium.giaibai.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class ShopeeImplicitWaitExample {
    WebDriver driver;

    @Test
    public void test() throws Exception {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://shopee.vn/");
        WebElement searchBox = driver.findElement(By.xpath("//input[@class='_1vp5']"));
        searchBox.sendKeys("laptop");


    }


    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
