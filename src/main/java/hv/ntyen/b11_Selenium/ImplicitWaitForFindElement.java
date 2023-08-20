package hv.ntyen.b11_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class ImplicitWaitForFindElement {
    public static void main(String[] args) {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys("scrooltest" + Keys.ENTER);
    }
}
