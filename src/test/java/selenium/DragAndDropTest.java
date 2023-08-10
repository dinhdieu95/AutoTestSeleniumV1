package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static common.Common.CONFIG_DRIVER_CHROME;
import static common.Common.URL_SRC_CHROME;

public class DragAndDropTest {
    private static WebDriver driver;

    @Test
    public void DragnDrop() {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/drag_drop.html");

        //Phần tử(BANK) cần kéo (drag)
        WebElement From = driver.findElement(By.xpath("//*[@id='credit2']/a"));

        //Sử dụng lớp Action để kéo và thả.
        Actions act = new Actions(driver);

        //Kéo và thả theo Offset.
        act.dragAndDropBy(From, 135, 40).build().perform();
    }

    @Test
    public void selectDemo() {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        Select drpCountry = new Select(driver.findElement(By.name("country")));
        drpCountry.selectByVisibleText("ANTARCTICA");

        //Chọn các mục trong nhiều phần tử select
        driver.get("http://jsbin.com/osebed/2");
        Select fruits = new Select(driver.findElement(By.id("fruits")));
        fruits.selectByVisibleText("Banana");
        fruits.selectByIndex(1);
    }

    @AfterClass
    public void after() {
        driver.close();
    }
}
