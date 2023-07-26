package giaibai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class WordpressLoginAutomation {
    @Test
    public void test(){
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        // Khởi tạo WebDriver và mở trang đăng nhập của Wordpress
        WebDriver driver = new ChromeDriver();
        driver.get("https://wordpress.com/log-in/?redirect_to=%2Fsites%3Fhosting-flow%3Dtrue&aff=15767&cid=1654213");

        // Nhập tên đăng nhập và mật khẩu
        WebElement usernameInput = driver.findElement(By.id("usernameOrEmail"));
        usernameInput.sendKeys("dieudta@tcbs.com.vn");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("your_password");

        // Nhấn nút đăng nhập
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        // Kiểm tra xem trang quản trị đã được mở thành công hay chưa (kiểm tra bằng cách kiểm tra tiêu đề trang)
        String expectedTitle = "My Sites";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Đăng nhập thành công vào trang quản trị của Wordpress.");
        } else {
            System.out.println("Đăng nhập không thành công.");
        }

        // Đóng trình duyệt
        driver.quit();
    }
}
