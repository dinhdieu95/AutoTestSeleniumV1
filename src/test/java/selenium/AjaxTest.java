package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class AjaxTest {
//     "Asynchronous JavaScript and XML" (JavaScript và XML không đồng bộ).
//     giúp tạo ra các trang web động và phản hồi nhanh hơn
    private String URL = "https://demo.guru99.com/test/ajax.html";

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        //create chrome instance
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(URL);
    }

    @Test
    public void test_AjaxExample() {

        By container = By.cssSelector(".container");
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(container));

        // Lấy văn bản trước khi thực hiện cuộc gọi ajax
        WebElement noTextElement = driver.findElement(By.className("radiobutton"));
        String textBefore = noTextElement.getText().trim();

        // Nhấp vào nút radio
        driver.findElement(By.id("yes")).click();

        // Nhấp vào nút "Check"
        driver.findElement(By.id("buttoncheck")).click();

        /* Lấy văn bản sau khi gọi ajax */
        WebElement TextElement = driver.findElement(By.className("radiobutton"));
        wait.until(ExpectedConditions.visibilityOf(TextElement));
        String textAfter = TextElement.getText().trim();

        /* Xác minh cả hai văn bản trước khi gọi ajax và sau khi gọi ajax. */
        Assert.assertNotEquals(textBefore, textAfter);
        System.out.println("Ajax Call Performed");

        String expectedText = "Radio button is checked and it's value is Yes";

        /* Xác minh văn bản kỳ vọng với văn bản đã cập nhật sau cuộc gọi ajax */
        Assert.assertEquals(textAfter, expectedText);
        driver.close();
    }
}
