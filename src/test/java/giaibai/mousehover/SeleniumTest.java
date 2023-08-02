package giaibai.mousehover;

import giaibai.ITest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class SeleniumTest extends ITest {
    @Override
    public void test() {
        super.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Drag and Drop
        super.getDriver().get("http://jqueryui.com/resources/demos/droppable/default.html");
        WebElement sourceElement = super.getDriver().findElement(By.id("draggable"));
        WebElement targetElement = super.getDriver().findElement(By.id("droppable"));
        dragAndDrop(super.getDriver(), sourceElement, targetElement);

        // Mouse Hover and Verify Content
        super.getDriver().get("https://www.amazon.com/");
        WebElement elementToHover = super.getDriver().findElement(By.id("nav-link-accountList"));
        hoverAndVerifyContent(super.getDriver(), elementToHover, "Your Account");

        // Slider Handling
        super.getDriver().get("https://jqueryui.com/slider/#range");
        WebElement sliderElement = super.getDriver().findElement(By.xpath("//div[@id='slider-range']/span[1]"));
        slideSlider(super.getDriver(), sliderElement, 50);

        // Drag and Drop Example 2
        super.getDriver().get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
        WebElement sourceElement2 = super.getDriver().findElement(By.id("todrag"));
        WebElement targetElement2 = super.getDriver().findElement(By.id("mydropzone"));
        dragAndDrop(super.getDriver(), sourceElement2, targetElement2);

        // Mouse Hover and Verify Content Example 2
        super.getDriver().get("https://www.w3schools.com/howto/howto_css_image_overlay.asp");
        WebElement elementToHover2 = super.getDriver().findElement(By.cssSelector(".container .column img"));
        hoverAndVerifyContent(super.getDriver(), elementToHover2, "Fjords");


    }
    public static void dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).build().perform();
    }

    public static void hoverAndVerifyContent(WebDriver driver, WebElement elementToHover, String expectedContent) {
        Actions actions = new Actions(driver);
        actions.moveToElement(elementToHover).build().perform();
        String actualContent = elementToHover.getText();
        if (actualContent.equals(expectedContent)) {
            System.out.println("Hover success! Content is: " + actualContent);
        } else {
            System.out.println("Hover failed! Expected content: " + expectedContent + ", but got: " + actualContent);
        }
    }

    public static void slideSlider(WebDriver driver, WebElement slider, int position) {
        int width = slider.getSize().getWidth();
        Actions moveSlider = new Actions(driver);
        Action action = moveSlider.dragAndDropBy(slider, (width * position) / 100, 0).build();
        action.perform();
    }
}