import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import java.util.ArrayList;
import java.util.List;

public class Bt6 {
    private WebDriver driver;
    ArrayList<String> arrListText=new  ArrayList<>();
    @Test
    public void ggTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@aria-label ='Tìm kiếm']")).sendKeys("selenium");
        driver.findElement(By.xpath("//textarea[@aria-label ='Tìm kiếm']")).sendKeys(Keys.ENTER);
//        driver.findElement(By.xpath("//input[@aria-label ='Tìm trên Google']")).click();
        Thread.sleep(1000);

        List<WebElement> resultList = driver.findElements(By.xpath("//*[contains(@class,'LC20lb MBeuO DKV0Md')]"));
        int totalResult = resultList.size();
        for (WebElement link : resultList) {
          arrListText.add(link.getAttribute("textContent"));
        }
        String expect ="selenium";
        for(int i = 0; i < arrListText.size(); i++) {
            System.out.println(arrListText.get(i));
            if (!arrListText.get(i).toLowerCase().contains(expect))
            System.out.println("co gia tri khong dung" + arrListText.get(i));
            else System.out.println("tim kiem thanh cong");
        }
        driver.close();
    }

}
