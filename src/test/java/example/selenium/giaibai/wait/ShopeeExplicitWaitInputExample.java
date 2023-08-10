package example.selenium.giaibai.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static common.Common.CONFIG_DRIVER_CHROME;
import static common.Common.URL_SRC_CHROME;

public class ShopeeExplicitWaitInputExample {
    WebDriver driver;

    @Test
    public void test() throws Exception {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        driver.get("https://shopee.vn/");
        WebElement searchBox = driver.findElement(By.xpath("//input[@class='_1vp5']"));

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement signInButton = wait.until(ExpectedConditions.visibilityOf(searchBox));
        signInButton.sendKeys("laptop");


    }


    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
