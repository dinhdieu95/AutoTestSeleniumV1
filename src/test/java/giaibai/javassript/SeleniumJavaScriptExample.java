package giaibai.javassript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class SeleniumJavaScriptExample {
    WebDriver driver;

    @Test
    public void test(){
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Tìm đối tượng bằng JavaScript
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        WebElement element = (WebElement) jsExecutor.executeScript("return document.getElementById('elementID');");

        // Sử dụng JavaScript để nhập dữ liệu vào ô văn bản
        jsExecutor.executeScript("arguments[0].value = 'Dữ liệu nhập vào ô văn bản';", element);

        // Sử dụng JavaScript để đặt giá trị cho một thành phần web
        jsExecutor.executeScript("arguments[0].setAttribute('attributeName', 'attributeValue');", element);

        // Di chuyển đến đối tượng cụ thể bằng JavaScript
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);

        // Lấy thông tin của một thành phần web bằng JavaScript
        String textContent = (String) jsExecutor.executeScript("return arguments[0].textContent;", element);
        System.out.println("Nội dung của đối tượng: " + textContent);

    }


    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
