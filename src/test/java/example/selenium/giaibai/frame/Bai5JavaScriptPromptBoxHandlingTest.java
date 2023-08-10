package example.selenium.giaibai.frame;

import example.selenium.giaibai.ITest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bai5JavaScriptPromptBoxHandlingTest extends ITest {
    @Override
    public void test() {
        super.getDriver().get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        // Xác nhận thông báo Alert
        clickAndConfirmAlert(super.getDriver());

        // Xác nhận thông báo Prompt
        clickAndConfirmPromptBox(super.getDriver(), null);

    }

    public void clickAndConfirmAlert(WebDriver driver) {
        driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void clickAndConfirmPromptBox(WebDriver driver, String message) {
        driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']")).click();
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys(message);
        promptAlert.accept();
    }
}






