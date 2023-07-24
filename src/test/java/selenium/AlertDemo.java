package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class AlertDemo {
    WebDriver driver;

    @Test
    public void alert() {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        // config sử dụng trình duyệt nào "webdriver.chrome.driver"
//        URL_SRC_CHROME đường dẫn tới file driver
        driver = new ChromeDriver();

        // Alert Message handling

        driver.get("https://demo.guru99.com/test/delete_customer.php"); // truy cập trang web
//        driver.findElement(By.name("cusid")) => tìm kiếm phần tử có tên là custid
//        sendKeys("53920") => nhập dữ liệu trên input

        driver.findElement(By.name("cusid")).sendKeys("53920");

        driver.findElement(By.name("submit")).submit();

        // Switching to Alert
        Alert alert = driver.switchTo().alert(); // lớp để lấy ra thông tin alert

        // Capturing alert message.
        String alertMessage= driver.switchTo().alert().getText();

        // Displaying alert message
        System.out.println(alertMessage);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Accepting alert
        alert.accept(); // chấp nhận cái alert
        driver.close();
    }
}
