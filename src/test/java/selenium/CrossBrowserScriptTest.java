package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static selenium.common.Common.*;

public class CrossBrowserScriptTest {
    WebDriver driver;

    /**
     * Hàm này sẽ được thực thi trước mỗi thẻ Test trong testng.xml
     *
     * @param browser
     * @throws Exception
     */
    @BeforeTest
    @Parameters("browser")
    public void setup(@Optional("chrome") String browser) throws Exception {
        //Kiểm tra xem tham số được truyền từ TestNG có là 'firefox' hay không
        if (browser.equalsIgnoreCase("firefox")) {
            //tạo phiên bản của Firefox
            System.setProperty(CONFIG_DRIVER_FIREFOX, URL_SRC_FIREFOX);
            driver = new FirefoxDriver();
        }
        //Kiểm tra xem tham số được truyền có là 'chrome' hay không
        else if (browser.equalsIgnoreCase("chrome")) {
            //đặt đường dẫn đến chromedriver.exe
            System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
            //tạo phiên bản của Chrome
            driver = new ChromeDriver();
        }
        //Kiểm tra xem tham số được truyền có là 'Edge' hay không
        else if (browser.equalsIgnoreCase("Edge")) {
            //đặt đường dẫn đến Edge.exe
            System.setProperty(CONFIG_DRIVER_ME, URL_SRC_ME);
            //tạo phiên bản của Edge
            driver = new EdgeDriver();
        } else {
            //Nếu không có trình duyệt nào được truyền, ném ra ngoại lệ
            throw new Exception("Trình duyệt không chính xác");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testParameterWithXML() throws InterruptedException {
        driver.get("http://demo.guru99.com/V4/");
        //Tìm tên người dùng
        WebElement userName = driver.findElement(By.name("uid"));
        //Nhập tên người dùng
        userName.sendKeys("guru99");
        //Tìm mật khẩu
        WebElement password = driver.findElement(By.name("password"));
        //Nhập mật khẩu
        password.sendKeys("guru99");
    }
    @AfterClass
    public void clean(){
        driver.close();
    }
}
