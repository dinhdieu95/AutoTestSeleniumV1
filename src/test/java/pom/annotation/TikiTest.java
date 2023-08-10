package pom.annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class TikiTest {
    @Test
    public void test() {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://tiki.vn/");

        TikiHomePage tikiHomePage = new TikiHomePage(driver);
        tikiHomePage.searchProduct("laptop");

        // Do something with the search results or other interactions on the page

        driver.quit();
    }
}