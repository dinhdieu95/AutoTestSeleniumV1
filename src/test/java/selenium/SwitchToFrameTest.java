package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static common.Common.CONFIG_DRIVER_CHROME;
import static common.Common.URL_SRC_CHROME;

public class SwitchToFrameTest {
    WebDriver driver;

    @Test
    public void switchWindow() {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();
        //int size = driver.findElements(By.tagName("iframe")).size();

	/*for(int i=0; i<=size; i++){
	    driver.switchTo().frame(i);
	    int total=driver.findElements(By.xpath("html/body/a/img")).size();
		System.out.println(total);
	    driver.switchTo().defaultContent(); //switching back from the iframe
	 }*/

        //Commented the code for finding the index of the element
        driver.switchTo().frame(0); //Switching to the frame
        System.out.println("********We are switched to the iframe*******");
        driver.findElement(By.xpath("html/body/a/img")).click();

        //Clicking the element in line with Advertisement
        System.out.println("*********We are done***************");

    }

    @Test
    public void testTabs() {
        driver.get("https://business.twitter.com/start-advertising");

        // considering that there is only one tab opened in that point.
        String oldTab = driver.getWindowHandle();
        driver.findElement(By.linkText("Twitter Advertising Blog")).click();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        // change focus to new tab
        driver.switchTo().window(newTab.get(0));

        // Do what you want here, you are in the new tab

        driver.close();
        // change focus back to old tab
        driver.switchTo().window(oldTab);

        // Do what you want here, you are in the old tab
    }

    @AfterClass
    public void after() {
        driver.close();
    }
}
