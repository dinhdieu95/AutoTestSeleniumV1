package hv_ntyen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static selenium.common.Common.CONFIG_DRIVER_CHROME;
import static selenium.common.Common.URL_SRC_CHROME;

public class WordPressLoginAndCheckLoginState {
    public static void main(String[] args) {
        System.setProperty(CONFIG_DRIVER_CHROME, URL_SRC_CHROME);
        WebDriver driver = new ChromeDriver();
        driver.get("https://wordpress.com/log-in/");
        WebElement usernameInput = driver.findElement(By.id("usernameOrEmail"));
        usernameInput.sendKeys("yennguyen");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        passwordInput.sendKeys("nhapmatkhau");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //Kiểm tra trạng thái login
        String loginTitle = driver.getTitle();
        System.out.println(driver.getTitle());
        if(loginTitle.equals("Log In — WordPress.com")){
            System.out.println("Login thất bại");
        }else {
            System.out.println("Login thành công");
        }
        driver.quit();

    }
}
