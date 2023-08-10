package pom.testcase;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.LoginPage;
import common.Common;
import common.DataProviderClass;
import common.DataProviderCsv;

import static com.codeborne.selenide.Selenide.open;
import static common.Common.getSource;

public class LogInTest {
    @BeforeTest
    void openTestPage() {
        open(getSource() + "page_with_selects_without_jquery.html");
    }

    @Test(dataProvider = "loginData", dataProviderClass = DataProviderClass.class)
    public void testcase2_login_to_tracker(String username, String password) {
        System.out.println(username + password);
        WebDriver driver = WebDriverRunner.getWebDriver();
        LoginPage loginPage = new LoginPage(driver);
        Common.wait(driver, 10);
        loginPage.enterUsername(username);
        loginPage.enterPass(password);
        loginPage.clickLogin();
    }
    @Test(dataProvider = "loginDataCsv", dataProviderClass = DataProviderCsv.class)
    public void testcase2_login_to_tracker_csv(String username, String password) {
        System.out.println(username + password);
        WebDriver driver = WebDriverRunner.getWebDriver();
        LoginPage loginPage = new LoginPage(driver);
        Common.wait(driver, 10);
        loginPage.enterUsername(username);
        loginPage.enterPass(password);
        loginPage.clickLogin();
    }

    @AfterTest
    void after() {
        WebDriverRunner.getWebDriver().quit();
    }
}
