package selenium.giaibai;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class SeleniumActions {
    WebDriver driver;
    @Test
    public  void test() throws Exception{
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        driver.get("http://jqueryui.com/resources/demos/droppable/default.html");

        // Thực hiện drag and drop một phần tử từ vị trí hiện tại đến vị trí mới
        WebElement draggableElement = driver.findElement(By.id("draggable"));
        WebElement droppableElement = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggableElement, droppableElement).build().perform();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        driver.get("https://www.amazon.com/");

        // Thực hiện mouse hover lên một phần tử và kiểm tra xem nội dung hiển thị có đúng như mong đợi không
        WebElement elementToHover = driver.findElement(By.id("nav-link-accountList"));
        actions.moveToElement(elementToHover).build().perform();

        // Kiểm tra xem nội dung hiển thị có đúng như mong đợi không
        WebElement signInOption = driver.findElement(By.cssSelector("#nav-flyout-ya-newCust .nav-action-inner"));
        String signInText = signInOption.getText();
        if (signInText.equals("Start here.")) {
            System.out.println("Nội dung hiển thị đúng như mong đợi.");
        } else {
            System.out.println("Nội dung hiển thị không đúng như mong đợi.");
        }


        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // Khởi tạo trình duyệt Chrome và mở trang web https://jqueryui.com/slider/#range
        driver.get("https://jqueryui.com/slider/#range");

        // Thực hiện kéo slider
        driver.switchTo().frame(0);
        WebElement slider = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
        actions.dragAndDropBy(slider, 200, 0).build().perform();


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Khởi tạo trình duyệt Chrome và mở trang web https://www.seleniumeasy.com/test/drag-and-drop-demo.html

        driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");

        // Thực hiện drag and drop một phần tử từ vị trí hiện tại đến vị trí mới
        WebElement draggable = driver.findElement(By.id("todrag"));
        WebElement droppable = driver.findElement(By.id("mydropzone"));
        actions.dragAndDrop(draggable, droppable).build().perform();


        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);



        // Khởi tạo trình duyệt Chrome và mở trang web https://www.w3schools.com/howto/howto_css_image_overlay.asp

        driver.get("https://www.w3schools.com/howto/howto_css_image_overlay.asp");

        // Thực hiện mouse hover lên một phần tử và kiểm tra xem nội dung hiển thị có đúng như mong đợi không
        WebElement image = driver.findElement(By.cssSelector(".img-hover-zoom"));
        actions.moveToElement(image).build().perform();

        // Kiểm tra xem nội dung hiển thị có đúng như mong đợi không
        WebElement overlay = driver.findElement(By.cssSelector(".overlay"));
        String overlayText = overlay.getText();
        if (overlayText.equals("Hover over me")) {
            System.out.println("Nội dung hiển thị đúng như mong đợi.");
        } else {
            System.out.println("Nội dung hiển thị không đúng như mong đợi.");
        }



    }



    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
