package selenium;

//import Flash.FlashObjectWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class FlashTest {
    WebDriver driver;

//    @Test
//    public void slideTest() throws Exception{
//        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
//        driver = new ChromeDriver();
//        driver.get("http://demo.guru99.com/test/flash-testing.html");
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        FlashObjectWebDriver flashApp = new FlashObjectWebDriver(driver, "myFlashMovie");
//        Thread.sleep(5000);
//        flashApp.callFlashObject("Play");
//        Thread.sleep(5000);
//        flashApp.callFlashObject("StopPlay");
//        Thread.sleep(5000);
//        flashApp.callFlashObject("SetVariable", "/:message", "Flash testing using selenium Webdriver");
//        System.out.println(flashApp.callFlashObject("GetVariable", "/:message"));
//    }

    @AfterClass
    public void after() {
        driver.close();
    }
}
