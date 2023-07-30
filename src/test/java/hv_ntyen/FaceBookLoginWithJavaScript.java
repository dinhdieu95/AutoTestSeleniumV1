package hv_ntyen;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class FaceBookLoginWithJavaScript {
    public static void main(String[] args) {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.facebook.com/");
        String xpathUserName = "//input[@data-testid='royal_email']";
        String xpathPassword = "//input[@data-testid='royal_pass']";
        WebElement searchBoxUsername = (WebElement) js.executeScript("return document.evaluate(arguments[0], document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;", xpathUserName);
        String inputUsername = "nguyenyen1508@gmail.com";
        js.executeScript("arguments[0].value = arguments[1];", searchBoxUsername, inputUsername);
        WebElement searchBoxPassword = (WebElement) js.executeScript("return document.evaluate(arguments[0], document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;", xpathPassword);
        String inputPassword = "123456";
        js.executeScript("arguments[0].value = arguments[1];", searchBoxPassword, inputPassword);
        String jsCode = "document.getElementsByName('login')[0].click();";
        js.executeScript(jsCode);

    }
}
