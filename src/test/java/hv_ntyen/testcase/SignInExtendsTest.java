package hv_ntyen.testcase;

import hv.ntyen.pom.initDriver.InitChromeDriver;
import hv.ntyen.pom.page.LoginPage;

import org.testng.annotations.Test;

public class SignInExtendsTest extends InitChromeDriver {

    @Override
    public void signInTest() {
        System.out.println(super.getDriver());
        LoginPage loginPage = new LoginPage(super.getDriver());
        System.out.println(loginPage.getTitel());
        if (loginPage.verifySigninPageTitle()==true){
            System.out.println("Mở trang Login thành công");
        } else
            System.out.println("Mở trang Login thất bại");
        try {
            loginPage.signIn("ntyen", "12345678@Abc");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(loginPage.getTitel());
        if (loginPage.verifyHomePageTitel()==true){
            System.out.println("Login thành công");
        } else
            System.out.println("Login thất bại");

    }
}
