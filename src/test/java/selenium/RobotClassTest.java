package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

import static common.Common.CONFIG_DRIVER_CHROME;
import static common.Common.URL_SRC_CHROME;

public class RobotClassTest {
    WebDriver driver;

    @Test
    public void robotTest() throws Exception {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/"); // Địa chỉ URL mẫu
//        driver.findElement(By.xpath("//a[contains(text(),'yearly-calendar.xls')]")).click(); // Nhấp chuột vào liên kết có chứa văn bản 'yearly-calendar.xls'
        Robot robot = new Robot(); // Lớp Robot ném AWT Exception
        Thread.sleep(2000); // Thread.sleep ném InterruptedException
        robot.keyPress(KeyEvent.VK_DOWN); // Nhấn phím mũi tên xuống trên bàn phím để điều hướng và chọn nút radio Lưu
        Thread.sleep(2000); // sleep được sử dụng chỉ để thể hiện từng sự kiện một
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        driver.close();
    }
}
