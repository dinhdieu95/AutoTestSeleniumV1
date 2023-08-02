package giaibai.frame;

import giaibai.ITest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bai4JavaScriptConfirmBoxHandlingTest extends ITest {
    @Override
    public void test() {
        super.getDriver().get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        super.getDriver().get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

        // Xác nhận thông báo Alert
        clickAndConfirmAlert(super.getDriver());

        // Xác nhận thông báo Confirm
        clickAndConfirmConfirmBox(super.getDriver(), true); // Chọn "OK"
//        clickAndConfirmConfirmBox(super.getDriver(), false); // Chọn "Cancel"

    }
    public static void clickAndConfirmAlert(WebDriver driver) {
        driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public static void clickAndConfirmConfirmBox(WebDriver driver, boolean isOk) {
        driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']")).click();
        Alert confirmAlert = driver.switchTo().alert();
        if (isOk) {
            confirmAlert.accept(); // Chọn "OK"
        } else {
            confirmAlert.dismiss(); // Chọn "Cancel"
        }
    }
}