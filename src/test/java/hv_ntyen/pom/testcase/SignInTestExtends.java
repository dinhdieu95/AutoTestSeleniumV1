package hv_ntyen.pom.testcase;

import hv_ntyen.pom.base.InitChromeDriver;
import hv_ntyen.pom.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignInTestExtends extends InitChromeDriver {
//    private WebDriver driver;

//    public LoginPage loginPage;

//    @BeforeTest
//    public void setUp() {
//
//        driver = super.driver;
//    }

    @Test
    public void signIn()  {
        System.out.println(super.getDriver());
        LoginPage loginPage = new LoginPage(super.getDriver());
        try {
            loginPage.signIn("ntyen", "12345678@Abc");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
