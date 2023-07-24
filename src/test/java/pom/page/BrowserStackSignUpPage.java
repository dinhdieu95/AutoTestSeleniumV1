package pom.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BrowserStackSignUpPage {
    WebDriver driver;

    @FindBy(xpath = "//h1")
    WebElement Header;

    @FindBy(xpath = "//*[@id='user_full_name']")
    WebElement userName;

    @FindBy(xpath = "//*[@id='user_email_login']")
    WebElement businessEmail;

    @FindBy(xpath = "//*[@id='user_password']")
    WebElement password;

    public BrowserStackSignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void veryHeader() {
        String getheadertext = Header.getText().trim();
        Assert.assertEquals("Create a FREE Account", getheadertext);
    }
    public void enterFullName(String arg1) {
        userName.sendKeys(arg1);
    }
    public void enterBusinessEmail(String arg1) {
        businessEmail.sendKeys(arg1);
    }
    public void enterPasswrod(String arg1) {
        password.sendKeys(arg1);
    }
}
