package example.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

import static common.Common.CONFIG_DRIVER_CHROME;
import static common.Common.URL_SRC_CHROME;

public class TestSelenium {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Test
    public void login() {
        System.setProperty(CONFIG_DRIVER_CHROME,  URL_SRC_CHROME);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.browserstack.com/users/sign_in");
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email_login")));

        WebElement username=driver.findElement(By.id("user_email_login"));
        WebElement password=driver.findElement(By.id("user_password"));
        WebElement login=driver.findElement(By.name("commit"));
        username.sendKeys("abc@gmail.com");
        password.sendKeys("your_password");
        login.click();
        String actualUrl="https://live.browserstack.com/dashboard";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}
