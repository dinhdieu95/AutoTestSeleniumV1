package selenium.giaibai.presskey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static common.Common.CONFIG_DRIVER_CHROME;
import static common.Common.URL_SRC_CHROME;

public class KeyBoardTest {
    WebDriver driver;
    @Test
    public  void test() throws Exception{
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        // Sử dụng phương thức sendKeys() để điền vào hai ô input "Enter a" và "Enter b"
        WebElement inputA = driver.findElement(By.id("sum1"));
        inputA.sendKeys("10");

        WebElement inputB = driver.findElement(By.id("sum2"));
        inputB.sendKeys("20");

        // Nhấn vào nút "Get Total"
        WebElement getTotalButton = driver.findElement(By.xpath("//button[text()='Get Total']"));
        getTotalButton.click();

        // Đóng trình duyệt
        

        // Truy cập vào trang web https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        // Sử dụng phương thức click() để tích chọn tất cả các ô checkbox
        WebElement selectAllCheckbox = driver.findElement(By.id("check1"));
        selectAllCheckbox.click();

        // Đóng trình duyệt
        

        // Truy cập vào trang web https://www.seleniumeasy.com/test/basic-radiobutton-demo.html
        
        driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");

        // Sử dụng phương thức click() để chọn RadioButton trong phần "Radio Button Demo"
        WebElement radioDemoButton = driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
        radioDemoButton.click();

        // Sử dụng phương thức click() để chọn RadioButton trong phần "Group Radio Buttons Demo"
        WebElement radioGroupButton = driver.findElement(By.xpath("//input[@value='Male' and @name='gender']"));
        radioGroupButton.click();

        // Đóng trình duyệt
        

        // Truy cập vào trang web https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html
        
        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

        // Sử dụng phương thức selectByVisibleText() để chọn một mục trong danh sách thả xuống
        WebElement selectDropdown = driver.findElement(By.id("select-demo"));
        Select select = new Select(selectDropdown);
        select.selectByVisibleText("Sunday");

        // Đóng trình duyệt
        

        // Truy cập vào trang web https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html
        
        driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");

        // Sử dụng phương thức sendKeys() để điền vào ô input "Date"
        WebElement dateInput = driver.findElement(By.xpath("//input[@placeholder='dd/mm/yyyy']"));
        dateInput.sendKeys("25/07/2023");

        // Sau đó nhấn vào nút "Clear"
        WebElement clearButton = driver.findElement(By.xpath("//button[text()='Clear']"));
        clearButton.click();

    }
    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
