package example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static common.Common.CONFIG_DRIVER_CHROME;
import static common.Common.URL_SRC_CHROME;

public class SlideTest {
    WebDriver driver;

    @Test
    public void slideTest() {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/slider/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));
        Actions actions = new Actions(driver);
        actions.moveToElement(slider).dragAndDropBy(slider, 150, 0).build().perform();
        System.out.println("Slide Action performed.");
    }

    @AfterClass
    public void after() {
        driver.close();
    }
}
