package selenium.common;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common {
    //    public SOURCE_URL = System.getProperty("user.dir") + "/src/test/resources/";
    public static final String URL_SRC_CHROME = System.getProperty("user.dir") + "/src/test/resources/driver/chromedriver.exe";
    public static final String CONFIG_DRIVER_CHROME = "webdriver.chrome.driver";
    public static final String CONFIG_DRIVER_FIREFOX = "webdriver.gecko.driver";

    public static WebDriverManager driver = WebDriverManager.chromedriver();
    public static WebDriver drv;

    public static void openFile(String fileName) {
        driver.setup();
        drv = new ChromeDriver();
        drv.get(System.getProperty("user.dir") + "/src/test/resources/" + fileName);
    }

    public static void close() {
        drv.close();
    }

    public static String getSource() {
        return System.getProperty("user.dir") + "/src/test/resources/";
    }
}
