package giaibai.frame;

import giaibai.ITest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bai3JavaScriptAlertHandlingReusableTest extends ITest {
    @Override
    public void test() {
        super.getDriver().get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        // Xác nhận thông báo Alert
        clickAndConfirmPromptAlert(super.getDriver(), "Thông điệp bất kỳ 1");
        clickAndConfirmPromptAlert(super.getDriver(), "Thông điệp bất kỳ 2");

    }

    public static void clickAndConfirmPromptAlert(WebDriver driver, String message) {
        driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']")).click();
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys(message);
        promptAlert.accept();
    }
}