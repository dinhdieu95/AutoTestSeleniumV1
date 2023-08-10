package example.selenium.giaibai;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static common.Common.*;

public class GoogleSearchTest {
    JavascriptExecutor js;
    WebDriver driver;
    @Test
    public  void test() throws Exception{
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        driver.get("https://www.google.com/"); // mở trình trang web
        //open()

        // Tìm kiếm từ khóa "selenium"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("example/selenium");

        // Click vào button "Tìm kiếm Google"
        fluentWaitByName(driver, 10l, "btnK");

        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();

        // Kiểm tra kết quả tìm kiếm có chứa từ khóa "selenium" hay không
        String searchResults = driver.getPageSource(); // lấy thông trang kết quả có chứa từ khóa selenium
        if (searchResults.contains("example/selenium")) {
            System.out.println("Kết quả tìm kiếm chứa từ khóa 'selenium'");
        } else {
            System.out.println("Kết quả tìm kiếm không chứa từ khóa 'selenium'");
        }

    }



    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
