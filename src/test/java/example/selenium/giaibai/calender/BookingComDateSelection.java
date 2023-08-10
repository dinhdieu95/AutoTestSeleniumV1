package example.selenium.giaibai.calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static common.Common.CONFIG_DRIVER_CHROME;
import static common.Common.URL_SRC_CHROME;

public class BookingComDateSelection {
    WebDriver driver;

    @Test
    public void test() throws Exception {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://www.booking.com/");
            WebDriverWait wait = new WebDriverWait(driver, 10);

            // Click vào ô nhập ngày
            WebElement dateInput = driver.findElement(By.xpath("//label[contains(text(), 'Ngày')]"));
            wait.until(ExpectedConditions.elementToBeClickable(dateInput)).click();

            // Chọn năm
            WebElement yearPicker = driver.findElement(By.xpath("//div[contains(@class, 'bui-calendar__month')]//span[contains(text(), '2023')]"));
            yearPicker.click();

            // Chọn tháng
            WebElement monthPicker = driver.findElement(By.xpath("//div[contains(@class, 'bui-calendar__month')]//span[contains(text(), 'Tháng 10')]"));
            monthPicker.click();

            // Chọn ngày là 10
            WebElement datePicker = driver.findElement(By.xpath("//div[contains(@class, 'bui-calendar__wrapper')]//td[@data-date='2023-10-10']"));
            datePicker.click();

            // Kiểm tra xem ngày đã được chọn đúng chưa
            WebElement selectedDate = driver.findElement(By.xpath("//div[contains(@class, 'bui-calendar__date')]//span[contains(text(), '10')]"));
            String selectedDateText = selectedDate.getText();
            if (selectedDateText.equals("10")) {
                System.out.println("Ngày đã được chọn đúng: " + selectedDateText);
            } else {
                System.out.println("Ngày đã được chọn sai: " + selectedDateText);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }


    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
