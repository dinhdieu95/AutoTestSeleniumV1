package example.selenium.giaibai;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import common.Common;

import java.util.concurrent.TimeUnit;

import static common.Common.CONFIG_DRIVER_CHROME;
import static common.Common.URL_SRC_CHROME;

public class ShopeeAutomation {
    JavascriptExecutor js;
    private static WebDriver driver;
    @Test
    public  void test() throws Exception{
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        // Khởi tạo WebDriver và mở trang chủ Shopee
        driver = new ChromeDriver();

        driver.get("https://shopee.vn/");
        driver.manage().window().setSize(new Dimension(1058, 804));
        Thread.sleep(30);
//        try {
//            wait(30);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,380.79998779296875)");
        js.executeScript("window.scrollTo(0,500)");

        WebElement qcPopup = (WebElement) js.executeScript("return document.querySelector('shopee-banner-popup-stateful').shadowRoot.querySelector('div > div > div > div > div')");
        qcPopup.click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("shopee-banner-popup-stateful")));
//        WebElement popupCloseButton = driver.findElement(By.xpath("//button[@class='shopee-popup__close-btn']"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(popupCloseButton).click().perform();
        // Execute JavaScript to get the shadow root
        // Locate the shadow host element
        WebElement shadowHost = driver.findElement(By.id("main"));
        Actions actions = new Actions(driver);
        actions.moveToElement(shadowHost, 0, 0).click().perform();
//        // Sử dụng `querySelector` trong shadow root để tìm phần tử cụ thể
//        WebElement closeButton = (WebElement) js.executeScript("return arguments[0].querySelector('div.shopee-popup__close-btn')", shadowHost);
//
//        // Thực hiện thao tác trên phần tử tìm thấy, ví dụ: click vào nút đóng popup
//        closeButton.click();

        // Tìm kiếm sản phẩm "iPhone"

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement searchBox = driver.findElement(By.xpath("//input[@class='shopee-searchbar-input__input']"));
        searchBox.sendKeys("iPhone");
        searchBox.submit();

        // Lọc sản phẩm theo giá từ 10 triệu đến 15 triệu
        driver.get("https://shopee.vn/search?keyword=iphone");

        Common.wait(driver, 15);
        WebElement minPriceInput = driver.findElement(By.xpath("//input[@class='shopee-price-range-filter__input'][1]"));
        WebElement maxPriceInput = driver.findElement(By.xpath("//input[@class='shopee-price-range-filter__input'][2]"));
        minPriceInput.sendKeys("10000000");
        maxPriceInput.sendKeys("15000000");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@class='shopee-button-solid shopee-button-solid--primary hdzZKE']")).click();
//        maxPriceInput.submit();
        driver.findElement(By.xpath("//input[@placeholder='Mật khẩu']")).sendKeys("matkhau");
        driver.findElement(By.xpath("//input[@placeholder='Email/Số điện thoại/Tên đăng nhập']")).sendKeys("0989056630");
        driver.findElement(By.xpath("//button[text() = 'Đăng nhập']")).click();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // Sắp xếp sản phẩm theo giá từ cao đến thấp
        WebElement sortDropdown = driver.findElement(By.xpath("//select[@name='sort']"));
        sortDropdown.sendKeys("giá từ cao đến thấp");

        // Chọn sản phẩm đầu tiên trong danh sách kết quả tìm kiếm và truy cập vào trang chi tiết sản phẩm
        WebElement firstProductLink = driver.findElement(By.xpath("//div[@data-sqe='item']//a"));
        firstProductLink.click();

        // Thêm sản phẩm vào giỏ hàng (thực hiện thao tác thêm vào giỏ hàng ở đây)

        // Đóng trình duyệt

    }
    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}