package selenium.giaibai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class ITest {
    WebDriver driver;
    @BeforeTest
    public void setUp(){
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test() {

    }


    @AfterTest
    public void afterTest() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
