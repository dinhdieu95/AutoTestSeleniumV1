package example.testng;

import example.selenium.giaibai.ITest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest extends ITest {
    @Test
    @Parameters("myName")

    public void parameterTest(String myName) {
        System.out.println("Parameterized value is : " + myName);
        super.getDriver().get("https://www.google.com/");
        super.getDriver().findElement(By.name("q")).sendKeys(myName);
        Assert.assertTrue(true);
    }
}