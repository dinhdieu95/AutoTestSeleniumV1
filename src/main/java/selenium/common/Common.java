package selenium.common;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common {
//    public SOURCE_URL = System.getProperty("user.dir") + "/src/test/resources/";
    public static WebDriverManager driver = WebDriverManager.chromedriver();
    public static WebDriver drv;

    public static void openFile(String fileName) {
        driver.setup();
        drv =  new ChromeDriver();
        drv.get(System.getProperty("user.dir") + "/src/test/resources/" + fileName);
    }
    public static void close(){
        drv.close();
    }
    public static String getSource(){
        return System.getProperty("user.dir") + "/src/test/resources/";
    }
}
