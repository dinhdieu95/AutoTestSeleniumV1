package example.selenium.giaibai;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static common.Common.CONFIG_DRIVER_CHROME;
import static common.Common.URL_SRC_CHROME;

public class GoogleActionsWithJavaScript {
    WebDriver driver;

    @Test
    public void test() throws Exception {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        // Sử dụng JavaScript để tìm đối tượng bằng XPath
        String xpathExpression = "//input[@name='q']";
        WebElement searchBox = (WebElement) ((JavascriptExecutor) driver).executeScript("return document.evaluate(arguments[0], document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;", xpathExpression);

        // Sử dụng JavaScript để nhập dữ liệu vào ô văn bản
        String inputText = "example/selenium";
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", searchBox, inputText);

        // Sử dụng JavaScript để click vào button "Tìm kiếm Google"
        String jsCode = "document.getElementsByName('btnK')[0].click();";
        ((JavascriptExecutor) driver).executeScript(jsCode);

        // Sử dụng JavaScript để lấy thông tin của kết quả tìm kiếm
        String searchResults = (String) ((JavascriptExecutor) driver).executeScript("return document.documentElement.outerHTML;");
        if (searchResults.contains("example/selenium")) {
            System.out.println("Kết quả tìm kiếm chứa từ khóa 'selenium'");
        } else {
            System.out.println("Kết quả tìm kiếm không chứa từ khóa 'selenium'");
        }


    }


    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
