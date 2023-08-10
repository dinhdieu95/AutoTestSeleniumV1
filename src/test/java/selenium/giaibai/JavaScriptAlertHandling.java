package selenium.giaibai;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class JavaScriptAlertHandling {
    WebDriver driver;
    @Test
    public  void test() throws Exception{
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        // Xác nhận thông báo Alert
        WebElement confirmAlertButton = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        confirmAlertButton.click();
        Alert confirmAlert = driver.switchTo().alert();
        String confirmAlertText = confirmAlert.getText();
        System.out.println("Nội dung thông báo Confirm Alert: " + confirmAlertText);
        confirmAlert.accept();

        // Nhấn vào nút "Click for Prompt Box" và nhập vào một thông điệp bất kỳ trong hộp thoại Prompt
        WebElement promptButton = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        promptButton.click();
        Alert promptAlert = driver.switchTo().alert();
        String promptAlertText = "Hello, this is a prompt message!";
        promptAlert.sendKeys(promptAlertText);
        System.out.println("Đã nhập thông điệp vào Prompt Alert: " + promptAlertText);
        promptAlert.accept();


    }



    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
