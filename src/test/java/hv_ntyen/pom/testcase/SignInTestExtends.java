package hv_ntyen.pom.testcase;

import hv_ntyen.pom.base.InitChromeDriver;
import hv_ntyen.pom.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class SignInTestExtends extends InitChromeDriver {
    private WebDriver driver;
    public LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        // Đã khởi tạo browser hết rồi kể cả wait, phóng to màn hình,...
        driver = getDriver();
    }
    @Test
    public void signIn() throws Exception {
        System.out.println(driver);
        loginPage = new LoginPage(driver);

        loginPage.signin("ntyen", "12345678@Abc");

    }
}
