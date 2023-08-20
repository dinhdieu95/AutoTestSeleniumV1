package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.testng.reporters.EmailableReporter;

public class BrowserStackHomePage {
    WebDriver driver;
    By Header=By.xpath("//h1");
    By getStarted=By.xpath("//*[@id='signupModalButton']");

    public BrowserStackHomePage(WebDriver driver) {
        this.driver=driver;
    }

    public void veryHeader() {
        String getheadertext=driver.findElement(Header).getText();
    }
    public void clickOnGetStarted() {
        driver.findElement(getStarted).click();
    }
}
