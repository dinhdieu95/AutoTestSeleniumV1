package hv_ntyen;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class GoogleSearchAndCheckResultWithJavaScript {
    public static void main(String[] args) {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.google.com/");
        String xpathSearch = "//*[@id=\"APjFqb\"]";
        WebElement searchBox = (WebElement) js.executeScript("return document.evaluate(arguments[0], document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;", xpathSearch);
        String inputText = "selenium";
        js.executeScript("arguments[0].value = arguments[1];", searchBox, inputText);

        // Click button tìm kiếm
        String jsCode = "document.getElementsByName('btnK')[0].click();";
        js.executeScript(jsCode);

        // Lấy kết quả tìm kiếm và so sánh
        String searchResults = (String) js.executeScript("return document.documentElement.outerHTML;");
        if (searchResults.contains("selenium")) {
            System.out.println("Kết quả tìm kiếm chứa từ khóa 'selenium'");
        } else {
            System.out.println("Kết quả tìm kiếm không chứa từ khóa 'selenium'");
        }
        driver.quit();
    }
}
