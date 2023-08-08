package pom.page.annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class TikiHomePageFindBysTest {
    @Test
    public void test() {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tiki.vn/");

        TikiHomePageFindBys tikiHomePage = new TikiHomePageFindBys(driver);
        tikiHomePage.searchForProduct("laptop");

        // Continue with other test steps

        System.out.println(driver.getPageSource().toUpperCase()) ;
        driver.quit();
    }
}
