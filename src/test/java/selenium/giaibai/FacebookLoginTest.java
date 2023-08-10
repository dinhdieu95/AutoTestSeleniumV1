package selenium.giaibai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static common.Common.CONFIG_DRIVER_CHROME;
import static common.Common.URL_SRC_CHROME;

public class FacebookLoginTest {
    WebDriver driver;

    @Test
    public void test() throws Exception {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        // Nhập email hoặc số điện thoại và mật khẩu của tài khoản
        WebElement emailOrPhone = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        emailOrPhone.sendKeys("your_email_or_phone");
        password.sendKeys("your_password");

        // Click vào nút "Đăng nhập"
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();

    }


    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
