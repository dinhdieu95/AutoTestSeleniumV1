package hv_ntyen.pom.testcase;

import hv_ntyen.pom.base.InitChromeDriver;
import hv_ntyen.pom.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class SignInTest {
    WebDriver driver;
    LoginPage loginPage;


//    @BeforeTest
//        public void setDriver() {
//        System.out.println("Mo trinh duyet...");
//        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://misast.mshopkeeper.vn/");
//        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        System.out.println(driver);
//
//    }

    @Test
    public void signIn() throws Exception {
        System.out.println("Mo trinh duyet...");
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://misast.mshopkeeper.vn/");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(driver);
        loginPage = new LoginPage(driver);

        loginPage.signin("ntyen", "12345678@Abc");

    }
//    @AfterTest
//    public void after(){
//        driver.close();
//    }
}
