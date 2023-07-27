import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.Element;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Bt5 {
    private WebDriver driver;
    @Test
    public void wordpressTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://wordpress.com/");
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href ='//wordpress.com/log-in/']")));
        driver.findElement(By.xpath("//a[@href ='//wordpress.com/log-in/']")).click();
        Thread.sleep(300);
        driver.findElement(By.id("usernameOrEmail")).sendKeys("hanh@gmail.com");
        driver.findElement(By.xpath("//button[@class='button form-button is-primary']")).click();
        String expect = "Create a new account";
        String actual=driver.findElement(By.xpath("//a[contains(@href,'/start?user_email=')]")).getText();
        System.out.println("actual: " +actual);
        Assert.assertEquals(expect,actual);
        driver.close();
//        public void class waitElement() {
//            Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                    .withTimeout(Duration.ofSeconds(30))
//                    .pollingEvery(Duration.ofSeconds(5))
//                    .ignoring(NoSuchElementException.class);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href ='//wordpress.com/log-in/']")));
//        }

    }

}
