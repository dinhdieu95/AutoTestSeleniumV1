import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class JqueryToolTipTest {
    @Test
    public void checkToolTip(){
        String baseUrl = "https://demo.guru99.com/test/tooltip.html";
        System.setProperty(CONFIG_DRIVER_CHROME,URL_SRC_CHROME);

        WebDriver driver = new ChromeDriver();
        String expectedTooltip = "What's new in 3.2";
        driver.get(baseUrl);

        WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));
        Actions builder = new Actions (driver);

        builder.clickAndHold().moveToElement(download);
        builder.moveToElement(download).build().perform();

        WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));
        String actualTooltip = toolTipElement.getText();

        System.out.println("Actual Title of Tool Tip  "+actualTooltip);
        if(actualTooltip.equals(expectedTooltip)) {
            System.out.println("Test Case Passed");
        }
        driver.close();
    }
}
