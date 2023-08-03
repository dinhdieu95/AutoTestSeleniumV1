package hv_ntyen;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class shadow_DOM_search_download_querySelector {
    public static void main(String[] args)
    {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-extensions");
        WebDriver driver = new ChromeDriver(options);
//        driver.get("chrome://downloads/");
//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        WebElement search_box = (WebElement) jse.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-toolbar#toolbar').shadowRoot.querySelector('cr-toolbar#toolbar').shadowRoot.querySelector('cr-toolbar-search-field#search').shadowRoot.querySelector('div#searchTerm input#searchInput')");
//        String js = "arguments[0].setAttribute('value','pdf')";
//        ((JavascriptExecutor) driver).executeScript(js, search_box);
        driver.get("https://shopee.vn/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement popupClose = (WebElement) jse.executeScript("return document.querySelector('home-page').shadowRoot.querySelector('downloads-toolbar#toolbar').shadowRoot.querySelector('cr-toolbar#toolbar').shadowRoot.querySelector('cr-toolbar-search-field#search').shadowRoot.querySelector('div#searchTerm input#searchInput')");
    }
}
