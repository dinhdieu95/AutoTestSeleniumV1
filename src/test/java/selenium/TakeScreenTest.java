package selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class TakeScreenTest {
    WebDriver driver;

    @Test
    public void takeScreenTest() {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();

        //  điều hướng tới trang webtrang
        driver.get("https://demo.guru99.com/test/delete_customer.php");

        // Tạo đối tượng TakesScreenshot từ đối tượng WebDriver để chụp ảnh màn hình
        TakesScreenshot scrShot = ((TakesScreenshot) driver); // class để chụp lại màn hình

        // Gọi phương thức getScreenshotAs để tạo tệp ảnh
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

        // Di chuyển tệp ảnh đến đích mới
        File DestFile = new File( System.getProperty("user.dir") + "/src/test/resources/driver/testTakeScreen.png");

        // Sao chép tệp vào đích
        try {
            FileUtils.copyFile(SrcFile, DestFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        driver.close();
    }
}
