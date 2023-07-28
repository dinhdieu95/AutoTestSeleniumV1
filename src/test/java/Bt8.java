import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bt8 {
    private WebDriver driver;

    @Test
    public void fbTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name ='email']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@name ='pass']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@name ='login']")).click();
        driver.close();
    }
}
