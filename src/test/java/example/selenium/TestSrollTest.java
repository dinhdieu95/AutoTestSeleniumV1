package example.selenium;
////
////import org.junit.After;
////import org.junit.Before;
////import org.junit.Test;
//import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import static common.Common.CONFIG_DRIVER_CHROME;
import static common.Common.URL_SRC_CHROME;

public class TestSrollTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @BeforeTest
    public void setUp() throws MalformedURLException {
        System.setProperty(CONFIG_DRIVER_CHROME,  URL_SRC_CHROME);
        driver = new ChromeDriver();
//        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());//web driver   RC  => chạy faile
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void testSroll() {
        driver.get("https://shopee.vn/");
//        driver.manage().window().setSize(new Dimension(1552, 832));
//        driver.findElement(By.cssSelector("shopee-banner-popup-stateful")).click();
//        driver.findElement(By.cssSelector(".shopee-searchbar-input__input")).click();
        js.executeScript("window.scrollTo(0,399.20001220703125)");
        js.executeScript("window.scrollTo(0,2584)");
//        driver.findElement(By.cssSelector(".a11y-image-carousel__item:nth-child(4) .nDMd5e")).click();
        js.executeScript("window.scrollTo(0,0)");
    }
}
