package hv_ntyen;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class ShopeeSearchAndOpenFirstItemWithJavaScript {
    public static void main(String[] args) {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://shopee.vn/");
        //  Đóng thông báo
        WebElement shadowHost = driver.findElement(By.id("main"));
        Actions actions = new Actions(driver);
        actions.moveToElement(shadowHost, 0, 0).click().perform();

      //  String jsCode1 = "document.getElementsByclassName('shopee-popup__close-btn')[0].click();";


        //Tìm kiếm trên trang chủ
        String xpathSearch = "//input[@class='shopee-searchbar-input__input']";
        WebElement searchBox = (WebElement) js.executeScript("return document.evaluate(arguments[0], document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;", xpathSearch);
        String inputText = "áo khoác nam";
        js.executeScript("arguments[0].value = arguments[1];", searchBox, inputText);

        // Click button tìm kiếm trên trang chủ shopee
        String jsCode = "document.getElementsByName('btnK')[0].click();";
        js.executeScript(jsCode);

        driver.quit();

    }


}
