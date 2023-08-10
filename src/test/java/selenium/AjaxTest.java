package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.guru.HomePage;
//import pom.page.guru.HomePage;

import static common.Common.CONFIG_DRIVER_CHROME;
import static common.Common.URL_SRC_CHROME;

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
    HomePage homePage;

    public void commonFunction(){
        By container = By.cssSelector(".container");
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(container));
        homePage = new HomePage(driver);
    }
    @Test
    public void test_AjaxExample() {
        commonFunction();



        // Lấy văn bản trước khi thực hiện cuộc gọi ajax
        WebElement noTextElement = driver.findElement(By.className("radiobutton"));// phần tử 1
//        String textBefore = homePage.getNoTextElement().getText().trim();
        System.out.println(noTextElement.getText().trim());
        // Nhấp vào nút radio
        homePage.clickButtonYes(); // phần tử thứ 3

        // Nhấp vào nút "Check"
        homePage.clickButtonCheckbox();// phần tử thứ 4

        /* Lấy văn bản sau khi gọi ajax */
        WebElement TextElement = homePage.getTextElement(); // phần tử thứ 2
//        wait.until(ExpectedConditions.visibilityOf(TextElement));
        String textAfter = TextElement.getText().trim();

        /* Xác minh cả hai văn bản trước khi gọi ajax và sau khi gọi ajax. */
//        Assert.assertNotEquals(textBefore, textAfter);
        System.out.println("Ajax Call Performed");

        String expectedText = "Radio button is checked and it's value is Yes";

        /* Xác minh văn bản kỳ vọng với văn bản đã cập nhật sau cuộc gọi ajax */
        Assert.assertEquals(textAfter, expectedText);

    }
    @Test
    public void test_02(){
        commonFunction();
        System.out.println("Trang thái hiển thị của button yes: "+ homePage.getButtonYes().isDisplayed());
    }
    @AfterClass
    public void clear(){
        driver.close();
    }
}
