package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class SwitchWindow {
    WebDriver driver;

    @Test
    public void switchWindow() {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/popup.php");
        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

        String MainWindow = driver.getWindowHandle();

        // To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();

            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                driver.findElement(By.name("emailid"))
                        .sendKeys("gaurav.3n@gmail.com");

                driver.findElement(By.name("btnLogin")).click();

                // Closing the Child Window.
                driver.close();
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);
    }
    @Test
    public void switchWindowOther() {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        driver = new ChromeDriver();
        driver.get("https://shopee.vn/");
        // Lấy cửa sổ trình duyệt đầu tiên
        String firstWindowHandle = driver.getWindowHandle();

        Actions builder = new Actions (driver);
        // Click vào liên kết để mở cửa sổ mới

        builder.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
        driver.get("http://www.bing.com/");
        System.out.println(driver.getTitle());
//        driver.findElement(By.linkText("Open New Window")).click();

        // Xác định tất cả các cửa sổ trình duyệt đang mở
        Set<String> windowHandles = driver.getWindowHandles();

        // Duyệt qua từng cửa sổ và chuyển đổi tới cửa sổ mới
        for (String handle : windowHandles) {
            if (!handle.equals(firstWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // Bây giờ bạn đang trong cửa sổ mới, thực hiện các thao tác cần thiết

//        // Đóng cửa sổ hiện tại và chuyển đổi lại cửa sổ ban đầu
//        driver.close();
        driver.switchTo().window(firstWindowHandle);

//        // Bây giờ bạn đang ở lại cửa sổ ban đầu, thực hiện các thao tác tiếp theo
//
//        driver.quit();
    }



    @AfterClass
    public void after() {
        driver.close();
    }
}
