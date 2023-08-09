package hv_ntyen.pom.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class InitChromeDriver {

    private WebDriver driver;
    public WebDriver getDriver(){
        return driver;
    }
    @BeforeClass
//    private static WebDriver setDriver() {
//        System.out.println("Mo trinh duyet...");
//        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://misast.mshopkeeper.vn/");
//        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        return driver;
//    }
    private WebDriver setUp() {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        String URL = "https://misast.mshopkeeper.vn/";
        //create chrome instance
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(URL);
        return driver;
    }
    @AfterClass
    public void closePage() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
