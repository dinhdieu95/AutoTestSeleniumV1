package example.selenium.giaibai;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static common.Common.CONFIG_DRIVER_CHROME;
import static common.Common.URL_SRC_CHROME;

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
