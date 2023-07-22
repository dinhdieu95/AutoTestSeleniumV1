import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class UploadAndDownLoadFile {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Test
    public void upload() {
        System.setProperty(CONFIG_DRIVER_CHROME,  URL_SRC_CHROME);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/upload/");
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        //nhập đường dẫn tệp vào trường đầu vào chọn tệp
        uploadElement.sendKeys("C:\\newhtml.html");

        // check the "I accept the terms of service" check box
//         đánh dấu vào ô "Tôi chấp nhận điều khoản dịch vụ"
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        driver.close();
    }
    @Test
    public void download() {
        System.setProperty(CONFIG_DRIVER_CHROME,  URL_SRC_CHROME);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/yahoo.html");
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement downloadButton = driver.findElement(By
                .id("messenger-download"));
        String sourceLocation = downloadButton.getAttribute("href");

        String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;

        try {
            Process exec = Runtime.getRuntime().exec(wget_command);
            int exitVal = exec.waitFor();
            System.out.println("Exit value: " + exitVal);
        } catch (InterruptedException | IOException ex) {
            System.out.println(ex.toString());
        }
        driver.close();
    }
}
