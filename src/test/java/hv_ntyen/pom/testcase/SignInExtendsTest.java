package hv_ntyen.pom.testcase;

import hv_ntyen.pom.base.InitChromeDriver;
import hv_ntyen.pom.page.LoginPage;
import org.testng.annotations.Test;

public class SignInExtendsTest extends InitChromeDriver {

    @Override
    public void signInTest() {
        System.out.println(super.getDriver());
        LoginPage loginPage = new LoginPage(super.getDriver());
        try {
            loginPage.signIn("ntyen", "12345678@Abc");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
