package example.selenium.giaibai.frame;

import example.selenium.giaibai.ITest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Bai2JavaScriptAlertHandlingTest extends ITest {
    @Override
    public void test() {
        super.getDriver().get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        super.getDriver().findElement(By.cssSelector("button[onclick='myPromptFunction()']")).click();
        Alert promptAlert = super.getDriver().switchTo().alert();
        promptAlert.sendKeys("Thông điệp bất kỳ");
        promptAlert.accept();
    }


}
