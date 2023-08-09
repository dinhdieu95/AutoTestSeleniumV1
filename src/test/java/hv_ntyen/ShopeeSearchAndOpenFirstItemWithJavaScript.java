package hv_ntyen;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class ShopeeSearchAndOpenFirstItemWithJavaScript {
    public static void main(String[] args) {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://shopee.vn/");
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //  Đóng thông báo
        WebElement qcPopup = (WebElement) js.executeScript("return document.querySelector('shopee-banner-popup-stateful').shadowRoot.querySelector('div > div > div > div > div')");
        qcPopup.click();

        //Tìm kiếm trên trang chủ
//        String xpathSearch = "//input[@class='shopee-searchbar-input__input']";
//        WebElement searchBox = (WebElement) js.executeScript("return document.evaluate(arguments[0], document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;", xpathSearch);
//        String inputText = "áo khoác nam";
//        js.executeScript("arguments[0].value = arguments[1];", searchBox, inputText);
        WebElement searchBox = driver.findElement(By.xpath("//*[contains(@class,'shopee-searchbar-input__input')]"));
        searchBox.sendKeys("áo khoác nam");
        WebElement searchButton = driver.findElement(By.xpath("//*[contains(@class,'shopee-searchbar__search-button')]"));
        searchButton.click();
        // Click button tìm kiếm trên trang chủ shopee
        String jsCode = "document.getElementsByName('btnK')[0].click();";
        js.executeScript(jsCode);

        //driver.quit();

    }


}
