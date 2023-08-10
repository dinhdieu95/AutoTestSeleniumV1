package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

import static common.Common.fluentWait;

public class FluentWaitTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;


    @Test
    public void login() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.browserstack.com/users/sign_in");
//        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(30))
//                .pollingEvery(Duration.ofSeconds(5))
//                .ignoring(NoSuchElementException.class);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email_login")));
//        Common common = new Common();
        fluentWait(driver, 30, "user_email_login");

        WebElement username = driver.findElement(By.id("user_email_login"));
        WebElement password = driver.findElement(By.id("user_password"));
        WebElement login = driver.findElement(By.name("commit"));
        username.sendKeys("abc@gmail.com");
        password.sendKeys("your_password");
        login.click();
        String actualUrl = "https://live.browserstack.com/dashboard";
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
}
