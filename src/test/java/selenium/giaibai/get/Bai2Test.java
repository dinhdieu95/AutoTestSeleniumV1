package selenium.giaibai.get;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class Bai2Test {
    WebDriver webDriver;
    @Test
    public void testSearchTK(){
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        webDriver = new ChromeDriver();//Mở trình duyệt Chrome
        webDriver.get("https://tiki.vn/"); // truy cập trang chủ
//        Tìm kiếm sản phẩm "áo khoác nam"
        WebElement inputSearch = webDriver.findElement(By.xpath("//*[@data-view-id = 'main_search_form_input']"));
        inputSearch.sendKeys("áo khoác nam");
//        main_search_form_button
        WebElement buttonSearch = webDriver.findElement(By.xpath("//*[@data-view-id = 'main_search_form_button']"));
        buttonSearch.click();
//      Chọn sản phẩm đầu tiên trong kết quả tìm kiếm
        WebElement firstElm = webDriver.findElement(By.xpath("//*[@data-view-id = 'product_list_item']"));
        firstElm.click();

//        Kiểm tra tên sản phẩm có chứa từ khóa "áo khoác nam" hay không
        Assert.assertTrue(webDriver.getPageSource().contains("áo khoác nam"));
    }
    @AfterTest
    public void clear(){
        webDriver.quit();
    }
}
