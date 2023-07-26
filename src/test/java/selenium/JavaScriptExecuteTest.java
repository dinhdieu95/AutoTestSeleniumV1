package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class JavaScriptExecuteTest {
    WebDriver driver;

    @Test
    public void alert() {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        // Mở trang web
        driver.get("https://demo.guru99.com/V4/");

        // Tạo đối tượng interface JavascriptExecutor bằng cách ép kiểu
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement nutDangNhap = driver.findElement(By.name("btnLogin"));

        // Nhập thông tin đăng nhập vào trang Guru99
        driver.findElement(By.name("uid")).sendKeys("mngr34926");
        driver.findElement(By.name("password")).sendKeys("amUpenu");

        // Thực hiện nhấp chuột vào nút ĐĂNG NHẬP bằng cách sử dụng JavascriptExecutor
        js.executeScript("arguments[0].click();", nutDangNhap);

//        // Tạo cửa sổ thông báo sử dụng JavascriptExecutor. Hiển thị thông báo chào mừng
//        js.executeScript("alert('Welcome to Guru99');");

        driver.quit();
    }
}
